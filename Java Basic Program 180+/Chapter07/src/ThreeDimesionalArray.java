import java.util.Scanner;

public class ThreeDimesionalArray {
    public static void main(String[] args) {
        
        int min,max,total=0;
        double avg;
        Scanner input =new Scanner(System.in);
        int[][][] temparature=new int[3][7][4];
        // taking input 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 4; k++) {
                    if (i==0) {
                        System.out.println("Enter Temparature Of Morning...");
                        temparature[i][j][k]=input.nextInt();
                    } else if (i==1){
                        System.out.println("Enter Temparature Of Noon...");
                        temparature[i][j][k]=input.nextInt();
                    }else if(i==2){
                        System.out.println("Enter Temparature Of Evening...");
                        temparature[i][j][k]=input.nextInt();
                    }
                }
            }
        }
        min=max=temparature[0][0][0];
            //finding min max etc
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 7; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (temparature[i][j][k]>max) {
                            max=temparature[i][j][k];
                        } else if (temparature[i][j][k]<min){
                            min=temparature[i][j][k];
                        }
                        total=total+temparature[i][j][k];
                    }
                }
            }
            avg=total/84;
            System.out.println("The Maximum Temparature of Month is : "+max);
            System.out.println("The Minimum Temparature of Month is : "+min);
            System.out.println("The Average Temparature of Month is : "+avg);
            input.close();
    }
}
/*it will store temprature of month
 * temp of morning, noon and evening of each day.
 * first dimention store <temparature of Morning,Noon,Evening;
 * second dimention store <7 days of week>
 * third dimentionb store <4 weeks of month>
 */