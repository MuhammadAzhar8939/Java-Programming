import java.util.Scanner;

public class DisplayNumberInActualAndReverseOrder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number to Store in Array");
            arr[i]=input.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println("The Number in Actual Order : "+arr[i]);
            
        }
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println("The Number in Reverse Order : "+arr[i]);
            
        }
        input.close();
    }
}
