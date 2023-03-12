import java.util.Scanner;

public class CircumferenceOfCircle {
    public static final double PI = 3.14159265358979323846;
    public static void main(String[] args) {
       double radius,area;
       System.out.println("Enter Radius of Circle");
       Scanner r=new Scanner(System.in); 
       radius=r.nextInt();
       r.close();
       area=2.0*PI*radius;
       System.out.println("Area Of Circle Is : "+area);
    }
}
