import java.util.Scanner;

public class VowelCharacterInString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Any Sentance ... ");
        String str=input.nextLine();//next line to read the first middle and last name
        int vowel=0;
        str=str+'\0';
        int i=0;
        while (str.charAt(i)!='\0') {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }

            i++;
        }
        System.out.println("The String Is : "+str);
        System.out.println("Vowel in String : "+vowel);
        input.close();
    }
}
