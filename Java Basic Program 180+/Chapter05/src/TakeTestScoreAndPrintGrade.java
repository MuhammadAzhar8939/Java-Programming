import java.util.Scanner;

public class TakeTestScoreAndPrintGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first Subject Marks...!");
        int score = input.nextInt();
        char Grade;
        input.close();
        if (score >= 90) {
            Grade = 'A';
            System.out.println("Your Grade is : " + Grade);
        } else if (score >= 80 && score <= 89) {
            Grade = 'B';
            System.out.println("Your Grade is : " + Grade);
        } else if (score >= 70 && score <= 79) {
            Grade = 'C';
            System.out.println("Your Grade is : " + Grade);
        } else if (score >= 60 && score <= 69) {
            Grade = 'D';
            System.out.println("Your Grade is : " + Grade);
        } else if (score < 60) {
            Grade = 'F';
            System.out.println("Your Grade is : " + Grade);
        }
    }
}

/*
 * score>=90 A
 * score80-89 B
 * score70-79 C
 * score60-69 D
 * below 60 Grade F
 * 
 */