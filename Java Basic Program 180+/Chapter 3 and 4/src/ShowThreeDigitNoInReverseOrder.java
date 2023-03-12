import java.util.Scanner;

public class ShowThreeDigitNoInReverseOrder {
    public static void main(String[] args) {
        int n,a,b;
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter a Three-Digit Number");
        n=inpScanner.nextInt();
        inpScanner.close();
        a=n/100;
        n=n%100;
        b=n/10;
        n=n%10;
        System.out.println("The Number in Reverse Order is : "+n+b+a);
    }
}
