public class Q7 {
    public static void main(String[] args) {
  
        String[] days = {
                "first", "second", "third", "fourth", 
                "fifth"
                };
        for(String day: days){
            switch(day){
                case "first":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    System.out.println("A partridge in a pear tree");
                    break;
                case "second":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    System.out.println("Two turtle doves");
                    break;
                case "third":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    System.out.println("Three french hens");
                    break;
                case "fourth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    System.out.println("Four calling birds");
                    break;
                case "fifth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    System.out.println("Five golden rings");
                    System.out.println("...you get the idea");
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}
