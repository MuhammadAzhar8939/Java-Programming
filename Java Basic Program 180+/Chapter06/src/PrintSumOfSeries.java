import java.util.Scanner;
import java.lang.Math;
public class PrintSumOfSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,length,x;
        double sum=0;
        System.out.println("Enter The Value of x : ");
        x=input.nextInt();
        System.out.println("Enter The Length of series : ");
        length=input.nextInt();
        input.close();
        for (i = 0; i<length; i++) {
            Double den= Math.pow(x, i);
            sum=sum+(1/den);
        }
        System.out.println("The Sum is : "+sum );
    }
}
