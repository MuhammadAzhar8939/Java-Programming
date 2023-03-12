import java.util.Scanner;

public class CheckIfNoIsFibonacciSeriesNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\n***\t***\tFibonacci Series\t***\t***\n");
        System.out.println("Enter Your Number ...");
        int num=input.nextInt();
        int a=0,b=1,next=a+b;
        if (num==0||num==1) {
            System.out.println("Yes it is Fibonacci series Number");
        } else {
            
            while (next<num) {
                a=b;
                b=next;
                next=a+b;
    
            }
            if (next==num) {
                System.out.println("Yes it is Fibonacci series Number");

            }else{
                System.out.println("No it is not Fibonacci series Number");

            }
        }
        input.close();

    }
}
