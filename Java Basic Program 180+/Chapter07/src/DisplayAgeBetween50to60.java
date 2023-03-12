import java.util.Scanner;

public class DisplayAgeBetween50to60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of Persons Required...");
        int num=input.nextInt();
        int[] Age = new int[num];
        int count=0;
        for (int i = 0; i < Age.length; i++) {
            System.out.println("Enter The Age Of Person...");
            Age[i]=input.nextInt();

            if (Age[i]>50 && Age[i]<60) {
                count++;
            }
        }

        System.out.println(count+" Persons are Between 50 and 60");
        input.close();
    }
}
