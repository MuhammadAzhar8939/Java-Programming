import java.util.Scanner;

public class DisplayPassOrFailUsingConditionalOp {
    public static void main(String[] args) {
        Scanner inpuScanner=new Scanner(System.in);
        System.out.println("Enter Your Marks ...");
        double marks=inpuScanner.nextDouble();
        inpuScanner.close();
        System.out.println(marks>=40?"Pass":"Fail");
    }
}
