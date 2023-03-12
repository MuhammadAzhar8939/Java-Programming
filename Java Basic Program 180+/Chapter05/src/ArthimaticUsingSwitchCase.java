import java.util.Scanner;

public class ArthimaticUsingSwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your first digit");
        double n1=input.nextDouble();
        System.out.println("Enter Operator (+,-,*,/)");
        char op=input.next().charAt(0);
        System.out.println("Enter Your second digit");
        double n2=input.nextDouble();
        input.close();
        switch (op) {
            case '+':
                System.out.println(n1 +" + "+n2+" = "+(n1+n2));
                break;
            case '-':
                System.out.println(n1 +" - "+n2+" = "+(n1-n2));
                break;
            case '*':
                System.out.println(n1 +" x "+n2+" = "+(n1*n2));
                break;
            case '/':
                if (n2==0) {
                    System.out.println("Cannot divide by Zero");
                } else {
                    System.out.println(n1 +" / "+n2+" = "+(n1/n2));
                    
                }
                break;
        
            default:
            System.out.println("Invalid Operator...");
                break;
        }
    }
}
