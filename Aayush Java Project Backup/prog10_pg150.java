import java.util.*;
public class prog10_pg150 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THE VALUE OF a and n");
        int a,i,n;
        double s=0;
        a=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<n;i++)
            s=s+(double)a/(i+1);
        System.out.println("SUM OF THE SERIES = "+s);
    }
}
