import java.util.*;
public class prog_17a_pg_168_series {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE FOR NUMERATOR [a] : ");
        int i_input=sc.nextInt();
        System.out.println("ENTER THE VALUE FOR DENOMINATOR[n]/THE POWER FOR a");
        int i_denominator= sc.nextInt();
        int i_sum=0;
        int i;
        for(i=1;i<=i_denominator;i++){

            i_sum+=(int)(Math.pow(i_input,i))/i;
        }
        System.out.println("S = "+ i_sum);
    }

}
