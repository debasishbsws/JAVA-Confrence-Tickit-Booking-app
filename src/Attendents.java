public class Attendents {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private int tickitCount;

    // Constructor
    public Attendents(String firstName, String lastName, int age, String email, String phone, int tickitCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.tickitCount = tickitCount;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getTickitCount() {
        return tickitCount;
    }

    // toString
    @Override
    public String toString() {
        return "Name=" + firstName + " " + lastName + ", Age=" + age
                + ", Tickit Count=" + tickitCount;
    }
}
