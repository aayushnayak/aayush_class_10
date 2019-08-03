import java.util.*;
public class discount_p_125_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ;

        System.out.println("PLEASE ENTER PRINTED PRICE - ");
        double p = sc.nextDouble();

        double  pd= p-(p*10/100);                              
        double  ps=pd+(pd*6/100);

        System.out.println("PRINTED PRICE  :-Rs.  " + p);
        System.out.println("DISCOUNT :- 10 %");
        System.out.println("PRICE AFTER DISCOUNT = Rs. "+pd );
        System.out.println("SALES TAX LEVIED ON GOODS = 6%");
        System.out.println("FINAL AND TOTAL AMOUNT TO BE PAID  AFTER DISCOUNT AND SALES TAX = Rs. " + ps);

    }
}

