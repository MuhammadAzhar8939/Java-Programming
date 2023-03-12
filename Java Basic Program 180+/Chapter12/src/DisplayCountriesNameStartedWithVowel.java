import java.util.Scanner;

public interface DisplayCountriesNameStartedWithVowel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] cities=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Please Enter The Name Of Country ... ");
            cities[i]=input.nextLine();//next line to read the first middle and last name       
        }
        System.out.println("Following Countries Started with vowel Character");
        for (int i = 0; i < 5; i++) {
            char ch=cities[i].charAt(0);//read first character of each name
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(cities[i]);
            }
        }

        input.close();
    }
}
