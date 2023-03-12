public class ExpressionSln {
    public static void main(String[] args) {
        System.out.println("if a=10 , b=20, c=15 , d= 8 \n solve this a*b/(-c*31%13)*d");
        int a=10,b=20,c=15,d=8;
        double result= (a*b/(-c*31%13)*d);
        System.out.println("\n\n==>\ta*b(-c*31%13)*d = "+result+"\t<==\n\n");
        
    }
}
