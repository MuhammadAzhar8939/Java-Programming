import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static final double PI=3.141;
    public static void main(String[] args) {
        double radius,area,circumference;
        Scanner iScanner=new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        radius=iScanner.nextDouble();
        area=PI*radius*radius;
        circumference=2*PI*radius;
        iScanner.close();
        System.out.println("The Area of Circle is : "+area+"\nCircumference of Circle is : "+circumference);
    }
}
/*formula 
 * area=PI*R*R
 * circumference=2*Pi*R
 */