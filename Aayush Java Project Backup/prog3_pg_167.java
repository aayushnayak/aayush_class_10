import java.util.*;
public class prog3_pg_167 {
    public static void main(String rags[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)//n divided by  i =0
                System.out.print( i+ " ");

        }
    }

}
