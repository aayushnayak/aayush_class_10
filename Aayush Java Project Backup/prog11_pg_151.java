import java.util.*;
public class prog11_pg_151 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,n;
        double s=0;
        System.out.println("ENTER THE VALUE OF n");
        n=sc.nextInt();
        for(a=1;a<=n;a++)
        {
            if(a%2==0)
                s=s-(double)a/(a+1);
            else s=s+(double)a/(a+1);

        }
        System.out.println("THE SUM OF THE SERIES = "+s);
    }
}
