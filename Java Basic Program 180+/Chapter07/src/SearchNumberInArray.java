import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number You wanna find ");
        int num=input.nextInt();
        input.close();
        int flag=-1;//if we found the number then set this equal to that index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num) {
                flag=i;
            }
        }
        if (flag==-1) {
            System.out.println("Number Not Found In array!");
        } else {
            System.out.println("Number Found at Index : "+flag);
            
        }
    }
}
