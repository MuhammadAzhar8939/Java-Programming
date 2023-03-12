import java.util.Scanner;

public class PossibleCombinationOfThreeDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first number...!");
        int n1 = input.nextInt();
        System.out.println("Enter Your second number...!");
        int n2 = input.nextInt();
        System.out.println("Enter Your third number...!");
        int n3 = input.nextInt();
        input.close();
        if (n1 != n2 && n2 != n3 && n1 != n3) {
            System.out.println(
                    n1 + "" + n2 + "" + n3 + "\t" + n1 + "" + n3 + "" + n2 + "\t" + n2 + "" + n1 + "" + n3 + "\t" + n2
                            + "" + n3 + "" + n1 + "\t" + n3 + "" + n2 + "" + n1 + "\t" + n3 + "" + n1 + "" + n2 + "\t");
        } else {
            if (n1 == n2 && n1 == n3) {
                System.out.println(n1 + "" + n2 + "" + n3 + "\t");
            }else {
                if (n1==n2) {
                    System.out.println(n1 + "" + n2 + "" + n3 + "\t"+n1 + "" + n3 + "" + n2 + "\t"+n3 + "" + n2 + "" + n1 + "\t");

                }else{
                    if (n1==n3) {
                        System.out.println(n1 + "" + n2 + "" + n3 + "\t"+n1 + "" + n3 + "" + n2 + "\t"+n2 + "" + n1 + "" + n3 + "\t");

                    }
                    else if(n2==n3){
                        System.out.println(n1 + "" + n2 + "" + n3 + "\t"+n2 + "" + n1 + "" + n3 + "\t"+n3 + "" + n2 + "" + n1 + "\t");

                    }
                }
            }
        }
    }
}
