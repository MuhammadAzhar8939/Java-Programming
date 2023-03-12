import java.util.Scanner;

public class FunctionOverLoading {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        System.out.println("Enter Number For Print asterike ");
        int n = inpScanner.nextInt();
        System.out.println("Enter Character/Symbol You wanna Print ");
        char c = inpScanner.next().charAt(0);
        System.out.println("Enter How Many Time You wanna Print this");
        int n1 = inpScanner.nextInt();
        inpScanner.close();
        System.out.println("\nFunction Call Without Parameter ");
        Display();
        System.out.println("\nFunction Call with Single Parameter ");
        Display(n);
        System.out.println("\nFunction Call With two Parameter ");
        Display(n1,c);
       
    }

    public static void Display() {
        System.out.println("**********");
    }
    public static void  Display(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    public static void Display(int num,char ch) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);

        }

    }
}
