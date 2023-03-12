import java.util.Scanner;

public class FactorialUsingFunction {
    static void Factorial(int a){
        double fact=1;
        for (int i = 1; i <= a; i++) {
            fact=fact*i;

        }
        System.out.println("The Factorial is : "+fact);
         }
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Enter Number To find Factorial ");
         int no1=input.nextInt();
 
         Factorial(no1);
         input.close();
     }
}
