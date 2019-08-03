import java.util.Scanner;

public class discountPAGENUMBER103
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE TOTALCOST");
        int TOTALCOST=sc.nextInt();

        int A = 5/100*TOTALCOST;
        if(TOTALCOST<=2000)
        
        System.out.println("DISCOUNT=5%");
        System.out.println("ASSURED GIFT IS WALL CLOCK");
        System.out.println("AMOUNT TO BE PAID AFTER DISCOUNT = " + A);
        int B = 10/100*TOTALCOST;
        if(TOTALCOST>=2001&&TOTALCOST<5000)
           
        System.out.println("DISCOUNT=10%");
        System.out.println("ASSURED GIFT IS SCHOOL BAG");
        System.out.println("AMOUNT TO BE PAID AFTER DISCOUNT = " + B);
         int   C = 15/100*TOTALCOST;
        if(TOTALCOST>=5001&&TOTALCOST<10000)
        
        System.out.println("DISCOUNT=10%");
        System.out.println("ASSURED GIFT IS ELECTRIC IRON");
        System.out.println("AMOUNT TO BE PAID AFTER DISCOUNT = " + C);
         int   D = 20/100*TOTALCOST;
        if(TOTALCOST>10000)
        
        System.out.println("DISCOUNT=20%");
        System.out.println("ASSURED GIFT IS WRIST WATCH ");
        System.out.println("AMOUNT TO BE PAID AFTER DISCOUNT = " + D);
    }
}
        

