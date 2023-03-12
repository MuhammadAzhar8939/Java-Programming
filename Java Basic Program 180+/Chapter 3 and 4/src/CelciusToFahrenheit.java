import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        double celcius,faran;
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("Enter Temparature in Celcius");
        celcius=inputScanner.nextDouble();
        faran=(9.0/5.0)*celcius+32;
        System.out.println("Temparature in Farenheit is : "+faran);
        inputScanner.close();
    }
}

/*
 * formula
 * faran=9/5*celcius+32
 */