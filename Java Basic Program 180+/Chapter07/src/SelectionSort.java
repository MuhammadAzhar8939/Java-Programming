import java.util.Scanner;

public class SelectionSort {
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
        int min,temp;
        for (int i = 0; i < arr.length-1; i++) {
            min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            if (min!=i) {
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
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
