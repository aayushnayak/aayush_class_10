import java.util.Scanner;
public class prog_16i_pg_168_series {
    public static void main(String args[]) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the Number of Terms:");
        int i_input = in.nextInt();
        int i_sum=0,i_firstno=1;
        for(int i=1;i<=i_input;i++) {
            i_sum+=i_firstno/(int)Math.pow(i,2);
            i_firstno+=2;
        }
        System.out.println("S="+i_sum);
    }
}
