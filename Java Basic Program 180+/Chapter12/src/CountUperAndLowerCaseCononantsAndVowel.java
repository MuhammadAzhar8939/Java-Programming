import java.util.Scanner;

public class CountUperAndLowerCaseCononantsAndVowel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Any Sentance ... ");
        String str=input.nextLine();//next line to read the first middle and last name
        int upperConsonants,lowerConsonants,upperVowel,lowerVowel;
        upperConsonants=lowerConsonants=upperVowel=lowerVowel=0;
        str=str+'\0';
        int i=0;
        while (str.charAt(i)!='\0') {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                upperVowel++;
            }
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                lowerVowel++;
            }else if(ch>=65&&ch<=90){
                upperConsonants++;
            }else if(ch>=97&&ch<=122){
                lowerConsonants++;
            }

            i++;
        }
        System.out.println("Upper Vowel in String : "+upperVowel);
        System.out.println("Lower Vowel in String : "+lowerVowel);
        System.out.println("Upper Consonants in String : "+upperConsonants);
        System.out.println("Lower Consonants in String : "+lowerConsonants);
        input.close();
    }
}
