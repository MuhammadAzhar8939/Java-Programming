import java.util.Scanner;

public class TabelOfNumberUsingFunction {
    static void tabel(int a){
        for (int index = 1; index <= 10; index++) {
            System.out.println(a+" x "+index+" = "+(a*index));
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number For Tabel ");
        int no1=input.nextInt();

        tabel(no1);
        input.close();
    }
}
