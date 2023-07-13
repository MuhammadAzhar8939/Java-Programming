import java.util.Scanner;

interface user{
    void input();
    void output();
}

public class InterfaceExample1 implements user {
    private String name;
    private double salary;
    @Override
    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your name : ");
        name=input.nextLine();
        System.out.println("Enter Your salary: ");
        salary=input.nextDouble();
        input.close();
    }
    
    @Override
    public void output() {
        System.out.println("The User : "+name+" have Salary : "+salary);
    }
    public static void main(String[] args) throws Exception {
        InterfaceExample1 user=new InterfaceExample1();
        user.input();
        user.output();
    }
}
