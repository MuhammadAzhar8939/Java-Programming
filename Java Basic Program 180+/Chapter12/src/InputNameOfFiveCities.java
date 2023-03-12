import java.util.Scanner;

public class InputNameOfFiveCities {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] cities=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Please Enter The Name Of City ... ");
            cities[i]=input.nextLine();//next line to read the first middle and last name       
        }
        System.out.println("You have Enter Following Five Cities");
        for (int i = 0; i < 5; i++) {
            System.out.println(cities[i]);
        }

        input.close();
    }
}
