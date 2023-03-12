import java.util.Scanner;

public class SimpleInterset {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Principal Amount ");
        int PrincipalAmount=input.nextInt();
        System.out.println("Enter Your Interest Rate ");
        int InterestRate=input.nextInt();
        System.out.println("Enter Your Time Years");
        int TimeYears=input.nextInt();
        System.out.println("Principle Amount is : "+PrincipalAmount);
        System.out.println("Interest Rate is : "+InterestRate);
        System.out.println("Time Years is : "+TimeYears);
        int Interest=(PrincipalAmount*InterestRate*TimeYears)/100;
        System.out.println("Interest Amount is : "+Interest);
        input.close();



    }
}
