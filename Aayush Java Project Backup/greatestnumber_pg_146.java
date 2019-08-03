import java.util.*;
public class greatestnumber_pg_146 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,m,n,min=0,max=0;
        System.out.println("ËNTER THE FIRST NUMBER");
        n=in.nextInt();
        min=n;max=n;
        System.out.println("ENTER THE REMAINING NUMBERS ");
        for(a=1;a<10;a++)
        {
            m=in.nextInt();
            if(m<min)
                min=m;
            if(m>max)
                max=m;
        }
        System.out.println("GREATSET NUMBER = "+max);
        System.out.println("SMALLEST NUMBER = "+min);
    }
}
