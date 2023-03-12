import java.util.Scanner;

public class ConvertHoursToWeekDaysHours {
    public static void main(String[] args) {
        int hours,days,weeks;
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter number of hours");
        hours=inpScanner.nextInt();
        inpScanner.close();
        weeks=hours/168;
        hours=hours%168;
        days=hours/24;
        hours=hours%24;
        System.out.println("Weeks: "+weeks+"\nDays: "+days+"\nHours: "+hours);
    }
}
