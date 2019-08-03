import java.util.*;
public class discount2_p_125_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ;

        System.out.println("PLEASE ENTER PRINTED PRICE - ");
        double p = sc.nextDouble();

        double  pd= p-(p*30/100);                              
        double  pd1=p-(p*20/100);
        double p2d= p-(pd1*10/100);
        

        System.out.println("PRINTED PRICE  :-Rs.  " + p);
        System.out.println("DISCOUNT OF 30 % GIVEN BY THE FIRST SHOPKEEPER :- "  + pd);
        System.out.println("DISCOUNT OF 20 % &10 % GIVEN BY THE second SHOPKEEPER = Rs. "+ p2d );
      //  System.out.println("SALES TAX LEVIED ON GOODS = 6%");
        System.out.println(" THEREFORE THE BETTER OFFER IS GIVEN BY THE FIRST SHOPKEEPER " );

    }
}

