import java.util.Scanner;
public class prog_16h_pg_168_series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Terms:");
        int i_input = in.nextInt();
        int i_sum=0;
        for(int i=1;i<=i_input;i++) {
            i_sum+=i/(i+1);
        }
        System.out.println("S="+i_sum);
    }
}
