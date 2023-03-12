import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("\n\n*****\t*****\tNumber should be Sorted \t*****\t*****\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number to Store in Array");
            arr[i] = input.nextInt();
        }
        int mid, loc = -1, start = 0, end = 9, num;
        System.out.println("\n\n*****\t*****\tThank You ...\t*****\t*****\n");

        System.out.println("Enter Number You wanna Find.");
        num = input.nextInt();
        while (start <= end) {
            mid=(start+end)/2;
            if (num==arr[mid]) {
                loc=mid;
                break;
            } else if(num<arr[mid]) {
                end=mid-1;
            }
            else if (num>arr[mid]) {
                start=mid+1;
            }
        }
        if (loc==-1) {
            System.out.println("Number Not Found In array!");
        } else {
            System.out.println("Number Found at Index : "+loc);
            
        }
        input.close();
    }
}
