import java.util.*;
public class profit_loss_p_125
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double p,l,p1,l1;

        System.out.println("PLEASE ENTER THE COST PRICE - ");
        double cp = sc.nextDouble();
        System.out.println("PLEASE ENTER THE SELLING PRICE - ");
        double sp = sc.nextDouble();

        p= sp-cp;                              
        p1=p/sp*100;
        l=cp-sp;
        l1=l/sp*100;

        System.out.println("COST PRICE  :- " + cp);
        System.out.println("SELLING PRICE:- "+ sp);

        if(cp <sp  )
            System.out.println("YOU HAVE EARNED  A PROFIT OF -  Rs. "+ p +" AND THE PROFIT PERCENT IS - "+p1 +" %"  );

        else if (cp>sp)
            System.out.println("YOU HAVE  EARNED A  LOSS  OF -  Rs. "+ l +" AND THE LOSS PERCENT IS - "+l1 +" %"  );

    }
}

