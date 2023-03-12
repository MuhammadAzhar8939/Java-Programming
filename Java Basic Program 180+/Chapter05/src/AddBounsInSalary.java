import java.util.Scanner;

public class AddBounsInSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Salary...!");
        double Salary = input.nextDouble();
        System.out.println("Enter Your Grade...!");
        int grade = input.nextInt();
        input.close();
        if (grade <= 15) {
            Salary=Salary*1.25;
            System.out.println("Your New Salary Is : "+Salary);
        }else{
            Salary=Salary*1.5;
            System.out.println("Your New Salary Is : "+Salary);
        }
      
    }
}
/*
 * grade equal or less 15 then 25% bonus
 * grade greater then 15 50% bouns
 */