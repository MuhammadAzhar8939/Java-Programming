import java.util.Scanner;

public class DisplayWeekDaysUsingSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Day Number ...!");
        int no=input.nextInt();
        input.close();
        switch (no) {
            case 1:
                System.out.println("Friday");
                break;
            case 2:
                System.out.println("Satureday");
                break;
            case 3:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Tuesday");
                break;
            case 6:
                System.out.println("Wednesday");
                break;
            case 7:
                System.out.println("Thursday");
                break;
        
            default:
            System.out.println("Invalid Input ...!");

                break;
        }
    }
}
