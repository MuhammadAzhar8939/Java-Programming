import java.util.Scanner;

public class PrecessorAndSucessorUsingFunction {
    static void PrecessorAndSucessor(int a){
       System.out.println("The Precessor of This Number is : "+(--a));
       System.out.println("The Successor of This Number is : "+(a+2));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number For Precessor and Successor ");
        int no1=input.nextInt();

        PrecessorAndSucessor(no1);
        input.close();
    }
}
