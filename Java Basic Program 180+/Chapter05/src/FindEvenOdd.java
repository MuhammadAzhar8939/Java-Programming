import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your number...!");
        int n1 = input.nextInt();
        input.close();
        if (n1%2 ==0) {

            System.out.println("The Number is Even ");
        }else{
            System.out.println("The Number is ODD ");

        }
      
    }
}
