import java.util.Scanner;

public class FindSumOfSquareOfInteger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,num;
        System.out.println("Enter Number Upto You wanna Square ...");
        num=input.nextInt();
        for (int i = 1; i <=num; i++) {
            sum=sum+(i*i);
        }
        System.out.println("The Sum is : "+sum );
        input.close();
    }
}
/*
 * FindSumOfSquareOfInteger.java
 * 1^2,2^2,3^2....n^2
 */