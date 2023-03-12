import java.util.Scanner;

public class CalculateTimeUsingDistanceAndSpeed {
    public static void main(String[] args) {
        int distance,speed,time;
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter The Distance Travelled by Vehicle in miles");
        distance=inpScanner.nextInt();
        System.out.println("Enter The Speed of Vehicle in miles per hour(mph)");
        speed=inpScanner.nextInt();
        time=distance/speed;
        inpScanner.close();
        System.out.println("Time required to reach the destination is "+time+" hours");


    }
}
