import java.util.Scanner;

public interface FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number whose Factorial you wanna find");
        int num=input.nextInt();
        input.close();
        int f=factorial(num);
        System.out.println("The Factorial Of This Number is : "+f);
    }
    public static int factorial(int no){
        if (no==0 ||no==1) {
            return 1;
        }else{
            return no*factorial(no-1);
        }
    }
}
