import java.util.Scanner;

public class PrintGradeUsingFunction {
    static char Grade(int a){
        if (a>=80) {
            return 'A';
        } else if(a>=60 && a<=79) {
            return 'B';
        }else if(a>=40 && a<=59){
            return 'C';
        }else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks ");
        int marks = input.nextInt();
        input.close();
        char g=Grade(marks);
        System.out.println("Your Grade is : "+g);
    }
}
