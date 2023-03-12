import java.util.Scanner;

public class InputAndDisplayNoUntillNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\n***\t***\tTo Terminate Program Enter -1\t***\t***\n");
        System.out.println("Enter Positive Number...");
        int num=input.nextInt();
        while (num!=-1) {
            System.out.println("You Entered : "+num);
            System.out.println("Enter Positive Number...");
            num=input.nextInt();
        }
        input.close();

    }
}
