import java.util.Scanner;

public class ShowFiveDigitNoInReverseOrder {
    public static void main(String[] args) {
        int n,a,b,c,d;
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter a Five-Digit Number");
        n=inpScanner.nextInt();
        inpScanner.close();
        a=n/10000;
        n=n%10000;
        b=n/1000;
        n=n%1000;
        c=n/100;
        n=n%100;
        d=n/10;
        n=n%10;
        System.out.println("The Number in Reverse Order is : "+n+d+c+b+a);
    }
}
