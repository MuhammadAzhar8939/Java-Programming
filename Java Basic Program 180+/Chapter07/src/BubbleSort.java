import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Digits To store in Array ...");
            arr[i]=input.nextInt();
        }
        System.out.println("Array Before Sorting ...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        input.close();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nArray After Sorting ... ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }   
    } 
}
/*
 * minimum element is selected and swaped with starting variable ==>selection sort
 */