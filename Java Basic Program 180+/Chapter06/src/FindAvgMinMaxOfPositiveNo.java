import java.util.Scanner;

public class FindAvgMinMaxOfPositiveNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Positive Number ... ");
        int num=input.nextInt();
        int count=0,sum=0,min,max,avg;
        min=num;
        max=num;
        while (num>=0) {
            count++;
            sum=sum+num;
            if (num>max) {
                max=num;
            }else if(num<min){
                min=num;
            }
            System.out.println("Enter Positive Number ... ");
            num=input.nextInt();
        }
        if (count==0) {
            System.out.println("You have Not Entered Any Positive Number ...");
        } else {
            avg=sum/count;
            System.out.println("You have Enter : "+count+" Positive number");
            System.out.println("The Sum of Numbers : "+sum);
            System.out.println("The Average is : "+avg);
            System.out.println("Maximum Number is : "+max);
            System.out.println("Minimum Number is : "+min);
        }
        input.close();
    }
}
