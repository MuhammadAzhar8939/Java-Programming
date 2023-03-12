import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\n***\t***\tFibonacci Series\t***\t***\n");
        System.out.println("How many Fibonacci Terms You want ...");
        int num=input.nextInt();
        int a=0,b=1,count=2,next=0;
        System.out.print(a+"\t"+b+"\t");
        while (count<num) {
            next=a+b;
            System.out.print(next+"\t");
            a=b;
            b=next;
            count++;

        }
        input.close();

    }
}
