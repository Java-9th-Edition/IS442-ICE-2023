import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]); // set the portnumber that the server is running on

        System.out.println("Server is running on port " + portNumber); // print out the port number that the server is running on
        try (
                ServerSocket serverSocket =
                        new ServerSocket(Integer.parseInt(args[0]));  // pass in the portNumber to the ServerSocket instance

                Socket clientSocket = serverSocket.accept();  // accept() method listens for incoming connections on a socket and accepts them
                // when a client connects to the server, accept() method returns a new Socket object that is connected to the client.
                // accept() method blocks until a connection is made

                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));

        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}
