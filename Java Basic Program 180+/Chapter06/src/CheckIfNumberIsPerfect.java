import java.util.Scanner;

public class CheckIfNumberIsPerfect {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ...");
        int num=input.nextInt();
        input.close();
        int sum=0,mid=num/2,n=num;
        for (int i = 1; i <= mid; i++) {
            if (num%i==0) {
                sum=sum+i;
            }
        }
        if (n==sum) {
            System.out.println("Yes This Is Perfect Number !");
        } else {
            System.out.println("No This Is Not Perfect Number !");            
        }
    }
}
/*
 * perfect number 6=1+2+3
 * 28=1+2+4+7+14
 */
