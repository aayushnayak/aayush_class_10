import java.util.*;
public class incometax_page_104
{
    public static void main(String args[])
    {
        int age ,ti;
        String g;
        double tax = 0.0;
        Scanner in=  new Scanner(System.in);
        System.out.println("ENTER GENDER [M] FOR MALE & [F] FOR FEMALE");
        g = in.next();
        System.out.println("ENTER AGE OF THE PERSON");
        age = in.nextInt();
        System.out.println("ENTER TAXABLE INCOME");
        ti = in.nextInt();
        
        if(age<=65 && g.equals("[M]") )
        {
            if(ti<=160000)
            tax=0.0;
            if(ti>160000 && ti<=500000)
            tax = (ti-160000)*10.0/100.0;
            if(ti > 500000 && ti<= 800000)
            tax = ((ti-800000)*30.0/100.0)+94000.0;
            System.out.println("TAXABLE INCOME = " + ti);
            System.out.println("INCOME TAAX = " + tax);
        }
        else
        {
            System.out.println("WRONG CATEGORY");
            System.out.println("NO CALCULATION OF INCOME TAX !!!!");
        }
    }
}