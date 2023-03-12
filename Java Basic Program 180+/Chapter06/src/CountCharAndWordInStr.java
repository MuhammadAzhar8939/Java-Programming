import java.util.Scanner;

public class CountCharAndWordInStr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Sentence ...");
        String str=input.nextLine();
        input.close();
        int ch=0,wd=1;
        int i=0;
        while (i!=str.length()) {
            if (str.charAt(i)==' ') {
                wd++;
            } else {
                ch++;
            }
            i++;
        }
        System.out.println("The Number of Words are : "+wd);
        System.out.println("The Number of Characters are : "+ch);
    }
}
