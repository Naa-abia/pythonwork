public class TryConstructors {
    String password;

    // to get the private name you will need to get the name

    // creating a constructors of the main class

    public TryConstructors() {
        // the argument that should define the constructor
    }

    public TryConstructors(String username) {
    }

    public TryConstructors(String username, String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        // TryConstructors tryconstructors = new TryConstructors();

        new TryConstructors("Augusta", "xxxx");

        Payment payment = new Payment("1234567", "MTN", 45.0, "GHS");
        String number = payment.getPhoneNumber();
        System.out.println(number);
    }

    // creating instances of the class

}
