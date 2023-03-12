import java.util.Scanner;
public class First {
    public static void main(String[] args) {

        System.out.println("Enter your choice between 1-to-7");
        Scanner number =new Scanner(System.in);
        int no =number.nextInt();
        number.close();
        switch (no) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Satureday");
                break;
        
            default:
            System.out.println("Invalid Choice");

                break;
        }
    }
}
