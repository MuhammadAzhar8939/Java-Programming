import java.util.Scanner;

public class FindQuotientAndRemainder {
    public static void main(String[] args) {
        int divident,divisor,quotient,remainder;
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("Enter your Divident");
        divident=inputScanner.nextInt();
        System.out.println("Enter your Divisor");
        divisor=inputScanner.nextInt();
        quotient=divident/divisor;
        remainder=divident%divisor;
        inputScanner.close();
        System.out.println("Quotient is : "+quotient);
        System.out.println("Remainder is : "+remainder);

    }
}
