import java.util.Scanner;

public class CheckPrimeOrCompositeNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ...");
        int num=input.nextInt();
        input.close();
        int prime=1,mid=num/2;
        for (int i = 2; i <= mid; i++) {
            if (num%i==0) {
                prime=0;
            }
        }
        if (prime==1) {
            System.out.println("Yes This Is Prime Number !");
        } else {
            System.out.println("This Is Composite Number !");            
        }
    }
}
/*
 * prime ==>Only divisible by 1 or it self
 */
