import java.util.Scanner;

public class CheckFirstIntIsMultipleOfSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first Number...!");
        int n1 = input.nextInt();
        System.out.println("Enter Your second Number...!");
        int n2 = input.nextInt();
        input.close();
        if (n1%n2==0) {
            System.out.println("yes First number is multtiple of Second number");
        }else{
            System.out.println("No First number is not multtiple of Second number");

        }
    }
}
