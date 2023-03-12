import java.util.Scanner;

public class PrintCongratsIfMarksforty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Marks...!");
        int marks=input.nextInt();
        input.close();
        if (marks >= 40) {
            System.out.println("Congratulations...!");
        }
    }
}
