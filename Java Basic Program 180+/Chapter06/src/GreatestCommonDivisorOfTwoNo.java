import java.util.Scanner;

public class GreatestCommonDivisorOfTwoNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number ...");
        int num1=input.nextInt();
        System.out.println("Enter Second Number ...");
        int num2=input.nextInt();
        input.close();
        int divisor;
        for (divisor=(num1<num2)?num1:num2; divisor >=1; divisor--) {
           
            if ((num1%divisor==0)&&(num2%divisor==0)) {
                break;
            }
        }
        System.out.println("GCD of both is : "+divisor);//here divisor hold the value that was during break statement execution
    }
}
