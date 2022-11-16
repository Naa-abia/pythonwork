import java.util.ArrayList;
import java.util.List;

//created to handle all payments (momo)

public class Payment {
    // things required before payments can be processed

    // the required phone number
    private static String phoneNumber;

    public Payment(double amount, String currency) {
    }

    public Payment(double amount) {
    }

    /**
     * 
     * @param phoneNumber phone number required for the payment
     * @param network     the payment network
     * @param amount      amount in double to pay for
     * @param currency    currency in which payment was made
     */

    public Payment(String currency) {
    }

    /**
     * 
     * @param phoneNumber
     * @param network
     * @param amount
     * @param currency
     */
    public Payment(String phoneNumber, String network, double amount, String currency) {

        Payment.phoneNumber = formatphoneNumber(phoneNumber);
    }

    /**
     * number is the number to be formatteed
     * 
     * @return string payment of the payment number with +233 also if the number
     *         starts with 0 and is 10 return +233 and the number
     */

    private String formatphoneNumber(String number) {
        if (number.startsWith("0") && number.length() == 10) {
            return "+233" + number.substring(0, 10);
        }
        return number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        // Payment payment = new Payment("12304323","VOD");
        Shape shape = new Square(10, 400);
        shape.findArea();

        // lists and enum
        chooseNetwork(NetworkType.VODAFONE);

        List<String> names = new ArrayList<>();
        names.add("Bright");

        List<String> MainNames = new ArrayList<>();
        MainNames.add("Bright");

        names.addAll(names);

    }

    /**
     * @param networktype
     */
    private static void chooseNetwork(NetworkType networktype) {
        networktype.name();
    }

}
