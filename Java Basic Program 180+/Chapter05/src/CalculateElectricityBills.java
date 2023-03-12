import java.util.Scanner;

public class CalculateElectricityBills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Units Consumed");
        int unit = input.nextInt();
        int lineRent=150;
        double bill=0;
        input.close();
        if (unit <= 300) {
            bill=(unit*2)+lineRent;
        }
        else if (unit>300 && unit<=500) {
            bill=(unit*5)+lineRent;
        }else if (unit >500) {
            bill=(unit*7)+lineRent;
        }

        //check if bill>2000 then add surcharge
        if(bill >= 2000.0){
            bill=bill*1.05;
        }
        //print bill
        System.out.println("Your Bill is : "+bill);
    }
}
/*
 * unit price <=300 then 2
 * unit price >300-500 then 5
 * unit price >500 then 7
 * 
 * 150 line rent
 * and if bill>2000 5% surcharge also add
 */