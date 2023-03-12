public class DegreeToRadianTabel {
    public static final double PI=3.141593;
    public static void main(String[] args) {
        int degree=0;
        double radian=0;
        while (degree<=360) {
            radian=degree*PI/180;
            System.out.println(degree+"\t"+radian);
            degree +=10;
        }

    }
}
