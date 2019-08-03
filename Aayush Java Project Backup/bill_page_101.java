import java.util.*;
public class bill_page_101
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n , u ;
        String name ;
        double amt = 0, total = 0 ;
        System.out.println("ENTER CONSUMERS NAME");
        name = in.nextLine();
        System.out.println("ENTER CONSUMERS NUMBER");
        n = in.nextInt();
        System.out.println("ENTER UNITS CONSUMED");
        u = in.nextInt();
        if(u<=100)
            amt = u*5.50;
        if((u>100)&&(u<=300))
            amt = 100*5.50+(u-100)*6.50;
        if((u>300)&&(u<=600))
            amt = 100*5.50+200*6.50+(u-300)*7.50;
        if((u>600))
            amt = 100*5.50+200*6.50+300*7.50+(u-600)*8.50;
        System.out.println("       MONEY RECEIPT       ");
        System.out.println("CONSUMERS NUMBER : " + n);
        System.out.println("CONSUMERS NAME : " + name );
        System.out.println("UNITS CONSUMED :  " + u);
        System.out.println("AMOUNT TO BE PAID : " + amt);
    }
}