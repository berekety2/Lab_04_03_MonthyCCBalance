public class Main {
    public static void main(String[] args) {

        int creditBalance = 5000;
        double interestRate = 0.17;
        double month1;
        double month2;

        //process input
        month1 = creditBalance * interestRate;
        month2 = month1 + (creditBalance * interestRate);

        System.out.println("Your interest due for the first month is: $" + month1);
        System.out.println("Your interest due for the second month is: $" + month2);

    }
}