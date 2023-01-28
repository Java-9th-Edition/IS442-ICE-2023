import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.err.println(
                    "Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }

        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try (
                // Socket class is used to create client sockets that connect to a server
                // Socket is an endpoint for sending or receiving data over a network, forms a common interface for network communication in java
                Socket echoSocket = new Socket(hostName, portNumber);
                // instantiate Socket class with hostName and portNumber to connect to.

                // PrintWriter class provides methods to print formatted output to a variety of destinations
                // such as OutputStream and Writer
                PrintWriter out =
                        new PrintWriter(echoSocket.getOutputStream(), true);
                // BufferedReader class reads text from a character-input stream

                BufferedReader in =
                        new BufferedReader(
                                // InputStreamReader class allows to read characters from an input stream like file or network socket
                                // Used in combination with Socket class to read input from a network socket
                                // Since network communication is based on bytes, InputStream only reads the bytes, InputStreamReader converts the bytes to characters

                                new InputStreamReader(echoSocket.getInputStream()));
                BufferedReader stdIn =
                        new BufferedReader(
                                new InputStreamReader(System.in))
        ) {
            // create String variable userInput
            String userInput;
            // while loop to read user input
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput); // prints out the userInput
                System.out.println("echo: " + in.readLine());  // prints out the echo from the server
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            System.exit(1);
        }
    }
}
