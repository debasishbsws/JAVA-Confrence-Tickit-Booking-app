import java.util.Scanner;

public class Helper {

    public Attendents getAttendentsData() {
        // taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Please enter your email");
        String email = scanner.nextLine();
        System.out.println("Please enter your phone");
        String phone = scanner.nextLine();
        System.out.println("Please enter the number of tickits you want to book");
        int tickitCount = scanner.nextInt();
        scanner.close();

        return new Attendents(firstName, lastName, age, email, phone, tickitCount);
    }

    public boolean validateUser(Attendents attendent, int requireMinAge) {
        boolean flag = true;
        if (attendent.getAge() < requireMinAge) {
            System.out.println("You are not eligible to attend the confrence");
            return false;
        }
        if (!validEmail(attendent.getEmail())) {
            System.out.println("Email is not valid");
            flag = false;
        }
        if (!validPhone(attendent.getPhone())) {
            System.out.println("Phone is not valid");
            flag = false;
        }
        if (!validName(attendent.getFirstName())) {
            System.out.println("First Name is not valid");
            flag = false;
        }
        if (!validName(attendent.getLastName())) {
            System.out.println("Last Name is not valid");
            flag = false;
        }
        if (!validTickitCount(attendent.getTickitCount())) {
            System.out.println("Tickit Count is not valid. Enter a +ve value");
            flag = false;
        }

        return flag;
    }

    private boolean validEmail(String email) {
        if (email.contains("@") && email.contains(".") && !email.contains(" ")) {
            return true;
        }
        return false;
    }

    private boolean validName(String name) {
        if (name.length() > 2 && !name.contains(" ")) {
            return true;
        }
        return false;
    }

    private boolean validPhone(String phone) {
        if (phone.length() <= 7) {
            return false;
        }
        for (char ch : phone.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private boolean validTickitCount(int tickitCount) {
        if (tickitCount > 0) {
            return true;
        }
        return false;
    }
}
