import java.util.Scanner;

public class SquareOfEachElementOfArray {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Integer To Store in Array ");
            array[i] = inpScanner.nextInt();
        }
        inpScanner.close();
        for (int i = 0; i < array.length; i++) {
            Square(array[i]);            
        }
    }
    public static void Square(int num){
        System.out.println(num+"\t"+num*num);
    }
}
