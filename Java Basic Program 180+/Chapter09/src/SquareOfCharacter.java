import java.util.Scanner;

public class SquareOfCharacter {
    static void draw(int a,char ch){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number ");
        int no1 = input.nextInt();
        System.out.println("Enter Character / Symbol");
        char op = input.next().charAt(0);
        input.close();
        draw(no1, op);
    }
}
