import java.util.*;
public class prog_17g_pg_168 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE FOR [a] ");
        double a=sc.nextDouble();
        System.out.println("ENTER THE VALUE FOR [n] ");
        double n=sc.nextDouble();
        int d=3;
        double sum=0;
     for(int i=1;i<=n;i++){
            sum+=(a+i)/d;//sum=sum+etc
            d+=2;//d=d+2;

        }
        System.out.println(sum);
    }
}

