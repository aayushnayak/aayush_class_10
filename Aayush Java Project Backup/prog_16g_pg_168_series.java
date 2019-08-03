import java.util.Scanner;
public class prog_16g_pg_168_series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Terms:");
        int i_input = in.nextInt();
        int i_sum=0;
        for(int i=1;i<=i_input;i++) {
            int factorial=1;
            for(int j=1;j<=i;j++) {
                factorial*=j;
            }
            i_sum+=factorial;
        }
        System.out.println("S="+i_sum);
    }
}
