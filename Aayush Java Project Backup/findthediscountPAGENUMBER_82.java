import java.util.Scanner;

public class findthediscountPAGENUMBER_82
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER PRICE OF COMPUTER");
        int c=sc.nextInt();
        System.out.println("ENTER PRICE OF PRINTER");
        int p=sc.nextInt();

        int r1=15,r2=10;
        double d1,d2,m=0,n=0;
        d1=r1/100*c;
        d2=r2/100*p;
        m=c-d1;
        n=p-d2;
        System.out.println("THE PRICE OF THE LAPTOP AFTER DISCOUNT = "+m);
        System.out.println("THE PRICE OF THE PRINTER AFTER THE DISCOUNT = "+n);
    }
}