import java.util.ArrayList;

public class KolkataConfrence implements Confrence {
    final static int CONFRENCE_SEAT = 100;
    int remainingTickits = CONFRENCE_SEAT;
    ArrayList<Attendents> attendents = new ArrayList<Attendents>();

    @Override
    public boolean bookTickit(Attendents attendent) {
        if (attendent.getTickitCount() > remainingTickits) {
            System.out.println("Sorry, there are only " + remainingTickits + " tickits remaining");
            return false;
        }

        attendents.add(attendent);
        remainingTickits -= attendent.getTickitCount();
        return true;
    }

    @Override
    public void greetUser() {
        System.out.println("Wellcome to " + CONFRENCE_NAME + "2022 - Kolkata, India");
        if (remainingTickits > 0) {
            System.out.println("Hello, there are " + remainingTickits + " tickits remaining, Book yours now");
        } else {
            System.out.println("Sorry, all tickits are sold out, Please come back next Year");
        }
    }

    @Override
    public void run() {
        greetUser();
        if (remainingTickits > 0) {
            Helper helper = new Helper();
            Attendents attendent = helper.getAttendentsData();
            helper.validateUser(attendent, 14); // validate user input
            if (bookTickit(attendent)) {
                System.out.println(
                        "Congratulation, you have successfully booked " + attendent.getTickitCount() + " tickits");
            } else {
                System.out.println("Sorry, we are unable to book your tickits, Please try again later");
            }
        }
    }

}
