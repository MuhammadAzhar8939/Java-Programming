import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double base,height,area;
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        base=inpScanner.nextDouble();
        System.out.println("Enter the height of triangle");
        height=inpScanner.nextDouble();
        area=0.5*base*height;
        inpScanner.close();
        System.out.println("The Area of Triangle is : "+area);

    }
}
/*formula
 * 1/2*base*height
 */