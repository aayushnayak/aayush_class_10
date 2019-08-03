import java.util.*;
public class bank_p_116
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double p, r, a;
        int n, ch;
        System.out.println("MENU LIST");
        System.out.println("1 : TERM DEPOSIT");
        System.out.println("2 : RECCURING DEPOSIT");
        System.out.println(" ENTER YOUR CHOICE");
        ch = in.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("ENTER 1 : PRINCIPAL , 2 : RATE , &  TIME");
            p = in.nextDouble();
            r = in.nextDouble();
            n = in.nextInt();
            a = p * Math.pow((1+r/100),n);
            System.out.println(" AMOUNT UNDER TERM DEPOSIT/T  "   + a);
            break;
            
            case 2:
            System.out.println("ENTER 1 : PRINCIPAL , 2 : RATE , &  TIME");
            p = in.nextDouble();
            r = in.nextDouble();
            n = in.nextInt();
            a = p * n+p*(n*(n+1)/2.0 * r/100.0 * 1.0/12.0);
            System.out.println(" AMOUNT UNDER RECURRING DEPOSIT/T  "   + a);
            break;
            
            default:
            System.out.println("INVALID CHOICE");
        }
    }
}