import java.util.Scanner;

public class CheckAverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first Subject Marks...!");
        int s1 = input.nextInt();
        System.out.println("Enter Your second Subject Marks...!");
        int s2 = input.nextInt();
        System.out.println("Enter Your third Subject Marks...!");
        int s3 = input.nextInt();
        int avg=(s1+s2+s3)/3;
        input.close();
        if (avg >= 80) {
            System.out.println("Congratulations...! You Are Above Standard");
            System.out.println("Congratulations...! Your Admission is Granted");
        }
    }
}
