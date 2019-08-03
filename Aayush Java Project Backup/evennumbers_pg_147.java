import java.util.*;
public class evennumbers_pg_147 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,s1=0,s2=0;
        System.out.println("ENTER A NUMBER AND ZERO TO QUIT");
        n=in.nextInt();
        while(n!=0)
        {
            if(n>0 && n%2==0)
                s1=s1+n;
            if(n<0 && n%2!=0)
                s2=s2+n;
            System.out.println("DO YOU WANT TO CONTINUE?");
            System.out.println("ENTER A NUMBER TO CONTINUE OR ZERO TO QUIT ");
            n=in.nextInt();
        }
        System.out.println("THE SUM OF POSITIVE EVEN NUMBERS = "+ s1);
        System.out.println("THE SUM OF NEGATIVE NUMBERS = "+s2);
    }
}
