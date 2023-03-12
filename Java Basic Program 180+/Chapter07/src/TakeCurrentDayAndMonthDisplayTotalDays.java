import java.util.Scanner;

public class TakeCurrentDayAndMonthDisplayTotalDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] DaysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter Month Number ...");
        int month=input.nextInt();
        System.out.println("Enter Day Number ...");
        int day=input.nextInt();
        int totalDays=0;
        for (int i = 0; i < month-1; i++) {
        totalDays=totalDays+DaysPerMonth[i];
        }

        System.out.println("Total Days Till Now Are : "+(totalDays+day));
        input.close();
    }
}
