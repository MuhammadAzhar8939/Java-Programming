import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year in this formate 'YYYY'");
        int y = input.nextInt();
        input.close();
        if (y%4 ==0) {

            System.out.println("Yes this is Leap Year ");
        }else{
            System.out.println("NO this is not Leap Year ");
        }
      
    }
}
