import java.util.Scanner;

public class InchesToCentimeter {
    public static void main(String[] args) {
        double heightInInches, heightInCentimeters;
        Scanner iScanner=new Scanner(System.in);
        System.out.println("Enter Your Height in Inches");
        heightInInches=iScanner.nextDouble();
        heightInCentimeters=heightInInches*2.54;
        iScanner.close();
        System.out.println("Your Height in Centimeters is : "+heightInCentimeters);

    }
}

/*
 * formula height*2.54;
 * 
 */