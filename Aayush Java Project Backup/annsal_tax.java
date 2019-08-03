import java.util.*;
public class annsal_tax
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x,y,z, t1,t2,t3,t4;
        int ann;

        System.out.println("PLEASE ENTER YOUR NAME - ");
        String name = sc.next();

        System.out.println("PLEASE ENTER YOUR ANNUAL SALARY- ");
        ann = sc.nextInt();


        System.out.println("YOUR BILL :- ");
        System.out.println("NAME :- "+ name);

        System.out.println("  YOUR ANNUAL SALARY - Rs "+ann);

        if( ann<=250000  )
            System.out.println("NO INCOME TAX TO BE PAID  " );

        else if (ann>250000 && ann<=500000)
            System.out.println("TOTAL AMOUNT OF INCOME TAX TO BE PAID = Rs. " +((ann-250000) * 10/100));

        else if( ann>500000 && ann<= 1000000)
            System.out.println("TOTAL AMOUNT OF INCOME TAX TO BE PAID = Rs. " +(((ann-500000)*20/100)+10000 ));
        else if( ann>1000000 )
            System.out.println("TOTAL AMOUNT OF INCOME TAX TO BE PAID  = Rs. " +(((ann-1000000)*30/100)+25000 ));

    }
}
