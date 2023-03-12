import java.util.Scanner;

public class SwapUsingPassByRef {
    static void swap(int[] no){
        int temp=no[0];
        no[0]=no[1];
        no[1]=temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num=new int[2];//to store number to pass their address to function as java dose not support pass by reference
        System.out.println("Enter First Number ");
        num[0] = input.nextInt();
        System.out.println("Enter Second Number ");
        num[1] = input.nextInt();
        input.close();
        System.out.println("Numbers Before Swaping ..."+num[0]+"\t"+num[1]);
        swap(num);
        System.out.println("Numbers Before Swaping ..."+num[0]+"\t"+num[1]);
    }
}
