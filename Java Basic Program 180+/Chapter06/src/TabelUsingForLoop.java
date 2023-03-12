import java.util.Scanner;

public class TabelUsingForLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int length,num;
        System.out.println("Enter Number for Tabel ...");
        num=input.nextInt();
        System.out.println("Enter Length Of Tabel ...");
        length=input.nextInt();
        for (int i = 1; i <=length; i++) {
            System.out.println(num +" x "+i+" = "+i*num);
        }
        input.close();
    }
}
