import java.util.Scanner;

public class GreatestCommonDivisorFunction {
    static int GCD(int n1,int n2) {
        int temp,gcd=0;
        if (n1<n2) {
            temp=n1;
        }
        else{
            temp=n2;
        }
        for (int i = 1; i <= temp; i++) {
            if (n1%i==0 && n2%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int no1 = input.nextInt();
        System.out.println("Enter Second Number ");
        int no2 = input.nextInt();
        int GreatestCommonDivisor=GCD(no1, no2);
        System.out.println("The Greatest Common Divisor is : "+GreatestCommonDivisor);
        input.close();

    }
}
