import java.util.*;
public class library
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double f1,f2,f3;
        int days;
        String z= " SUPER DELUXE"  ;
        String y ="DELUXE ";
        String x = "SEMI DELUXE " ;
        int n1=1;
        int n2=2;

        System.out.println("PLEASE ENTER THE NAME OF THE BOOK - ");
        String bname = sc.next();
        System.out.println("PLEASE ENTER YOUR NAME - ");
        String name = sc.next();

        System.out.println("PLEASE ENTER THE NUMBER OF DAYS IT HAS BEEN SINCE YOU HAVE  ISSUED THE BOOK - ");
        days = sc.nextInt();
        f1=40*days;
        f2=65*days;
        f3=80*days;

        System.out.println("YOUR BILL :- ");
        System.out.println("NAME :- "+ name);
        System.out.println("NAME OF THE BOOK  :- "+ bname);

        if( days<=5  )
            System.out.println("TOTAL AMOUNT TO BE PAID AS FINE IS   =  "+ f1+" paise" );

        else if (days>5 && days<=10)
            System.out.println("TOTAL AMOUNT TO BE PAID AS FINE IS   =  "+ f2+" paise" );

        else if( days>10)
            System.out.println("TOTAL AMOUNT TO BE PAID AS FINE IS   =  "+ f3+" paise");

        System.out.println("PLEASE GIVE A FEEDBACK OF THE BOOK AND OUR LIBRARY SERVICES - ");
        String feedback = sc.next();
        System.out.println("THANKYOU FOR YOUR FEEDBACK - ");

    }
}

