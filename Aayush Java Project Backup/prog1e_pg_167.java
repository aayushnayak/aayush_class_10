import java.util.*;
public class prog1e_pg_167 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF TERMS");
        int t=sc.nextInt();
        int i;
        int a=1;
        int b=2;
        for(i=1;i<=t;i++)
        {
            System.out.print(a+ " ");
            a*=10+b;
            b+=1;
        }

    }
}
