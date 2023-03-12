import java.util.Scanner;

public class AreaOfTriange {
    static double Area(int base, int height) {
        double area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base of Triange ");
        int base = input.nextInt();
        System.out.println("Enter height of Triange ");
        int height = input.nextInt();
        input.close();
        double area=Area(base, height);
        System.out.println("The Area of Triangle is : "+area);
    }
}
