import java.util.Scanner;

public class SalaryDeduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        double salary = input.nextDouble();
        double netSalary;
        input.close();
        if (salary >= 20000) {
            netSalary=salary-(salary* 7.0/100);
            System.out.println("Your Net Salary is : " + netSalary);
        } else if (salary>=10000 &&salary<20000) {
            netSalary=salary-1000;
            System.out.println("Your Net Salary is : " + netSalary);
        } else {
            netSalary=salary;
            System.out.println("Your Net Salary is : " + netSalary);
        }

    }
}
