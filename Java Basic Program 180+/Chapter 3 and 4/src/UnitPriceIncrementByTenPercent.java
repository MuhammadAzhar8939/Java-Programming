import java.util.Scanner;

public class UnitPriceIncrementByTenPercent {
    public static void main(String[] args) {
        double e1,e2,g1,g2,p1,p2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Unit Price of Electricity");
        e1=input.nextDouble();
        System.out.println("Enter The Unit Price of Gas");
        g1=input.nextDouble();
        System.out.println("Enter The Unit Price of Petrol");
        p1=input.nextDouble();

        input.close();

        e2=e1*1.1;
        g2=g1*1.1;
        p2=p1*1.1;
        System.out.println("New Prices of Electricity : "+e2);
        System.out.println("New Prices of Gas : "+g2);
        System.out.println("New Prices of Petrol : "+p2);

    }
}
