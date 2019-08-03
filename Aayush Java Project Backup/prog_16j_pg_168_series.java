import java.util.Scanner;
public class prog_16j_pg_168_series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Terms:");
        int i_input = in.nextInt();
        int i_sum=0;
        for(int counter=1;counter<=i_input;counter++) {
            int i_sum1=0,i_product=1;
            for(int j=1;j<=counter;j++) {
                i_sum1+=j;
                i_product*=j;
            }
            i_sum+=(i_sum1/i_product);
        }
        System.out.println("S="+i_sum);
    }
}
