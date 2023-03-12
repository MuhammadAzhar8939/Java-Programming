import java.util.Scanner;

public class CopyStringInOtherVariable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Any sentance ... ");
        String str=input.nextLine();//next line to read the first middle and last name
        String str2;
        str2=str;
        System.out.println("You Have Entered\t:"+str);
        System.out.println("After Copying\t\t:"+str2);
        input.close();
    }
}
