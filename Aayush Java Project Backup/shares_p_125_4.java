
public class shares_p_125_4
{
    public static void main(String args[])
    {

        double s=3000;
        double n = 10;
        double d=10;
        double ad=2000;

        double  ns= ad*100/n*d;                              
        double  hs=3000-ns;

        System.out.println("DESIRED SHARES   :-Rs.  " + s);
        System.out.println("NOMINAL VALUE :- Rs.10 ");
        System.out.println("NUMBER OF SHARES HE HAS  = Rs. "+ ns );
        System.out.println("HOW MUCH MORE NUMBER OF SHARES HE NEEDS  = Rs. " +hs);

    }
}

