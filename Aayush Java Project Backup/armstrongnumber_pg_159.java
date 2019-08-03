import java.util.*;
public class armstrongnumber_pg_159 {
    public static void main(String args [] )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int n=sc.nextInt();
        int a,num,s=0;
        num=n;
        while(n>0) {
            a = n % 10;
            s = s + a * a * a;
            n = n / 10;
        }
            if(num==s)
                System.out.println("THE NMBER "+num + " IS AN ARMSTRONG NUMBER");
            else
                System.out.println("THE NMBER "+num + " IS NOT AN ARMSTRONG NUMBER");
        }

    }


