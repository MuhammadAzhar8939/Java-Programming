import java.util.Scanner;

public class InputUsingForAndContinue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter Positive Number ...");
            int num=input.nextInt();
            if (num<=0) {
                continue;
            }else{
                System.out.println("You Entered : "+num);
            }
        }
        input.close();
    }
}
