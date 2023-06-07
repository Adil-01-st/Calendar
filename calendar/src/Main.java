import java.util.Calendar;

public class Main {
    public static void main(String[] args)
    {
        boolean error=false;
        if(args.length==0)
        {
        System.out.println(
                "Hey! I'm Java-aplication.\n" +
                "Run me now \"help\" and I talk you+" +
                        "what I can:)"
        );
        else if(args.length==1)
        {
            if(args[0].equals("help")) {
                System.out.println(
                        "I can tell a easy questions\n" +
                                "That see my result, write \n" +
                                "anything question from next:\n" +
                                "-\"Hey!\"n" +
                                "-\"How are you?\"n" +
                                "-\"What's up?\"n" +
                                "-\"What you doing?\"n" +
                                "-\"Why you don't sleep?\"n" +
                                "-\"What you doing today afternoon?\"n" +
                                "-\"Bye\"n"
                );
            }
            else if(args[0].equals("hey!"))
            {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                if(hour<12){
                    System.out.println("Good morning!");
                } else if(hour>=12 && hour<=18) {
                    System.out.println("Good day!");
                } else {
                    System.out.println("Good afternoon!");
                }
            }
            }
        }
    }
}