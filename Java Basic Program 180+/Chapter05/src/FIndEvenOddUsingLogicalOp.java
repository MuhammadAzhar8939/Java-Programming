import java.util.Scanner;

public class FIndEvenOddUsingLogicalOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number...!");
        int no = input.nextInt();
        input.close();
        if (!(no%2==0)) {
            System.out.println("The Number is ODD");
            
        } else {
            System.out.println("The Number is Even");

        }
    }
}
