import java.util.Scanner;

public class App {

    // JAVA confrence teckit booking app
    final static String CONFRENCE_NAME = "JavaOne Confrence";

    public static void main(String[] args) throws Exception {

        System.out.println("Wellcome to " + CONFRENCE_NAME);
        KolkataConfrence kolkataConfrence = new KolkataConfrence();
        SanFranciscoConfrence sanFranciscoConfrence = new SanFranciscoConfrence();
        while (kolkataConfrence.getRemaningTickits() > 0 || sanFranciscoConfrence.getRemaningTickits() > 0) {
            System.out.println("Please select your confrence location");
            System.out.println("1. San Francisco, USA");
            System.out.println("2. Kolkata, India");
            System.out.println("3. Exit");
            Scanner scanner = new Scanner(System.in);
            int location = scanner.nextInt();
            scanner.close();
            switch (location) {
                case 1:
                    sanFranciscoConfrence.run();
                    break;
                case 2:
                    kolkataConfrence.run();
                    break;
                case 3:
                    System.out.println("Thank you for using our app");
                    System.exit(0);
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
    }
}
