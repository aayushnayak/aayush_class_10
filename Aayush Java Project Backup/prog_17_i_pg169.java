import java.util.Scanner;

public class prog_17_i_pg169 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A:");
        double a= sc.nextDouble();
        System.out.println("Enter the Number of Terms:");
        double t= sc.nextDouble();
        double  sum=0;
        for(int i=1;i<=t;i++) {
            sum+=i/(int)Math.pow(a,i);
        }
        System.out.println("S="+sum);
    }
}

