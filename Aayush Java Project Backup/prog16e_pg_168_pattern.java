import java.util.Scanner;

public class prog16e_pg_168_pattern
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Terms:");
        int i_input = in.nextInt();
        int i_sum=0;
        for(int i=1;i<=i_input;i++) {
            for(int j=1;j<=i;j++) {
                i_sum+=j;
            }
        }
        System.out.println("S="+i_sum);
    }
}


