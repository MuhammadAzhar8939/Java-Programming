import java.util.Scanner;

public class NumberManipulationUsingForAndBreak {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter Positive Number ...");
            int num=input.nextInt();
            if (num<=0) {
                break;
            }else{
                System.out.println("You Entered : "+num);
            }
        }
        input.close();
    }
}
