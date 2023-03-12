import java.util.Scanner;

public class HealthClubMemberShip {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("***\tWelcome To Health Club Membership Menu\t***");
        System.out.println("1: Standard Adult Membership");
        System.out.println("2: Child Membership");
        System.out.println("3: Senior Citizen Membership");
        System.out.println("4: Quit the program");
        int choice=input.nextInt();
        if (choice>=1&&choice<=3) {
            System.out.println("For How many Months you want membership");
            int months=input.nextInt();
            input.close();
            int amount;
            switch (choice) {
                case 1:
                     amount=months*50;
                    System.out.println("Total charges are : "+amount);
                    break;
                case 2:
                    amount=months*20;
                    System.out.println("Total charges are : "+amount);
                    break;
                case 3:
                    amount=months*30;
                    System.out.println("Total charges are : "+amount);
                    break;           
                default:
                    System.out.println("Thanks For Visiting \nValid choices are 1-to-4");
                    break;
            }
        } else {
            System.out.println("Thank you For Visiting ...");

        }
       
        
    }
}
