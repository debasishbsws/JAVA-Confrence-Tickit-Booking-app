import java.util.Scanner;

public class App {

    // JAVA confrence teckit booking app
    final static String CONFRENCE_NAME = "JavaOne Confrence";
    final static int CONFRENCE_SEAT = 100;

    public static void main(String[] args) throws Exception {

        System.out.println("Wellcome to " + CONFRENCE_NAME);

        int locationNo = chooseLocation();
        if (locationNo == 1) {
            System.out.println("You have selected " + locationNo + " for " + CONFRENCE_NAME);
        } else {
            System.out.println("You have selected " + locationNo + " for " + CONFRENCE_NAME);
        }
    }

    static int chooseLocation() {
        System.out.println("To procede please choose the location of the confrence");
        System.out.println("1. San Francisco, USA");
        System.out.println("2. Kolkata, India");
        Scanner scanner = new Scanner(System.in);
        int locationNo = scanner.nextInt();
        scanner.close();
        if (locationNo < 1 || locationNo > 2) {
            System.out.println("Please select a valid location");
            chooseLocation();
        }
        return locationNo;
    }

    static void greetUser(int remainingTickits) {
        System.out.println("Hello, there are " + remainingTickits + " tickits remaining");
    }
}
