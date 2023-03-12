import java.util.Scanner;
public class GlobalVariable {
    public static int num=0;
    static void globalVariable(){
        num=num*2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number To Store in Global Variable ... ");
        num = input.nextInt();
        input.close();
        System.out.println("Value of Global Variable before function call : "+num);
        globalVariable();
        System.out.println("Value of Global Variable After function call : "+num);
    }
}
