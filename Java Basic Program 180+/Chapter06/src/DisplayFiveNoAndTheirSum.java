public class DisplayFiveNoAndTheirSum {
    public static void main(String[] args) throws Exception {
        int i=1,sum=0;
        
        while ( i<=5) {
            System.out.println(i);
            sum=sum+i;
            i++;
        }
            System.out.println("The Sum is : " +sum);
    }
}
