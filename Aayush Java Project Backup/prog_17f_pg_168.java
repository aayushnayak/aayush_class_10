import java.util.Scanner;
public class prog_17f_pg_168 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value of A :");
        int numerator = in.nextInt();
        System.out.println("Enter the Number of Terms :");
        int terms = in.nextInt();
        int sum=0;
        for(int i=1;i<=terms;i++) {
            sum+=(numerator+i);
        }
        System.out.println("S="+sum);
    }
}
