import java.util.ArrayList;

public class SanFranciscoConfrence implements Confrence {
    final static int CONFRENCE_SEAT = 50;
    private int remainingTickits = CONFRENCE_SEAT;
    ArrayList<Attendents> attendents = new ArrayList<Attendents>();
    Helper helper = new Helper();

    @Override
    public int getRemaningTickits() {
        return remainingTickits;
    }

    @Override
    public boolean bookTickit(Attendents attendent) {
        if (attendent.getTickitCount() > remainingTickits) {
            System.out.println("Sorry, there are only " + remainingTickits + " tickits remaining");
            return false;
        }

        attendents.add(attendent);
        remainingTickits -= attendent.getTickitCount();
        // not sending tickits in email
        return true;
    }

    @Override
    public void greetUser() {
        System.out.println("Wellcome to " + CONFRENCE_NAME + "2022 - San Francisco, USA");
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

            Attendents attendent;
            do {
                attendent = helper.getAttendentsData();
            } while (!helper.validateUser(attendent, 14));

            if (bookTickit(attendent)) {
                System.out.println(
                        "Congratulation, you have successfully booked " + attendent.getTickitCount() + " tickits");
            } else {
                System.out.println("Sorry, we are unable to book your tickits, Please try again later");
            }
        }

    }

}
