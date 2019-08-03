import java.util.*;
public class prog_17_h_pg169 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE FOR [a]");
        double a= sc.nextDouble();
        double d=2;
        double i;
        double sum=0;
        for(i=1;i<=20;i++){
            sum+=a/d;
            d+=3;
        }
        System.out.println("SUM = "+sum);
    }
}
