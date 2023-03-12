import java.util.Scanner;

public class SumOfSeriesUsingFunction {
    static double Factorial(int a) {
        double fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;

        }
        return fact;
    }
    static void SeriesSum(int num){
        double sum=1;
        for (int index = 1; index <=num; index++) {
            sum=sum+(1/Factorial(index));
        }
        System.out.println("The Sum of Series Is : "+sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Maximum Number of Denominator ... ");
        int no1 = input.nextInt();
        input.close();
        SeriesSum(no1);
    }
}
/*
 * 1+1/1!+1/2!+1/3!+....n
 */
