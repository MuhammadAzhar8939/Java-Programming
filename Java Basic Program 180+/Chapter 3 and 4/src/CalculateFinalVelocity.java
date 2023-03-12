import java.util.Scanner;

public class CalculateFinalVelocity {
    public static void main(String[] args) {
        int initialVelocity,finalVelocity,acceleration,time;
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("Enter initial Velocity of an Object");
        initialVelocity=inputScanner.nextInt();
        System.out.println("Enter the Acceleration");
        acceleration=inputScanner.nextInt();
        System.out.println("Enter the Time");
        time=inputScanner.nextInt();
        inputScanner.close();
        finalVelocity=initialVelocity+acceleration*time;
        System.out.println("Final Velocity Of This Object will be : "+finalVelocity);

    }
}
/*
 * formula 
 * vf=vi+at
 */
