import java.util.Scanner;

public class CheckIfDivisibleByThreeUsingConditionalOp {
    public static void main(String[] args) {
        Scanner inpuScanner=new Scanner(System.in);
        System.out.println("Enter Your Number ...");
        double number=inpuScanner.nextDouble();
        inpuScanner.close();
        System.out.println(number%3==0?"Yes,Divisible ":"No,Not Divisible");
    }
}
