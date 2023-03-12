import java.util.Scanner;

public class ConvertSecondsToHHMMSS {
    public static void main(String[] args) {
        int sec,hours,minutes,seconds;
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("Enter time in Seconds");
        sec=inputScanner.nextInt();
        inputScanner.close();
        hours=sec/3600;
        sec=sec%3600;
        minutes=sec/60;
        sec=sec%60;
        seconds=sec;
        System.out.println("Time Is "+hours+":"+minutes+":"+seconds);
    }
}
