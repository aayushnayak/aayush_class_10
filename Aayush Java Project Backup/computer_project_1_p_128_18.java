import java.util.*;
public class computer_project_1_p_128_18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,a1,b1,c1,d1,a2,b2,c2,d2;
        int days;
        String z= " SUPER DELUXE"  ;
        String y ="DELUXE ";
        String x = "SEMI DELUXE " ;
        int n1=1;
        int n2=2;
      
        
        
        System.out.println("PLEASE ENTER YOUR NAME - ");
        String name = sc.next();
        System.out.println("CHOOSE CATEGORY  FROM ( SEMI DELUXE(x) , DELUXE(y) , SUPER DELUXE(z))");
        char cat = sc.next().charAt(0);
        System.out.println("PLEASE ENTER THE NUMBER OF DAYS YOU WANT TO RESIDE IN THE HOTEL - ");
         days = sc.nextInt();
        a=2500*10/100*days;
        b=2500*15/100*days;
        c=2500*20/100*days;
        d=2500*30/100*days;

        a1=3500*10/100*days;
        b1=3500*15/100*days;
        c1=3500*20/100*days;
        d1=3500*30/100*days;

        a2=5000*10/100*days;
        b2=5000*15/100*days;
        c2=5000*20/100*days;
        d2=5000*30/100*days;
        System.out.println("YOUR BILL :- ");
        System.out.println("NAME :- "+ name);
        
        

           switch(cat)
        {
            case 'x'   :
            if( days>1 && days <=3 )
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. "+ a );

            else if (days>3 && days<=5)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " +b);

            else if( days>5 && days<= 10)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " + c);
            else if( days>5 && days<= 10)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " + d);
                System.out.println("THE CATEGORY OF ROOM IS :- SEMI DELUXE ROOM");
            break;

            case 'y':
            if( days>1 && days <=3 )
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. "+ a1 );

            else if (days>3 && days<=5)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " +b1);

            else if( days>5 && days<= 10)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " + c1);
            else if( days>5 && days<= 10)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " + d1);
                 System.out.println("THE CATEGORY OF ROOM IS :- DELUXE ROOM");
            break;

            case 'z'  :
            if( days>1 && days <=3 )
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. "+ a2 );

            else if (days>3 && days<=5)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " +b2);

            else if( days>5 && days<= 10)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " + c2);
            else if( days>5 && days<= 10)
                System.out.println("TOTAL AMOUNT TO BE PAID AFTER DISCOUNT = Rs. " + d2);
                 System.out.println("THE CATEGORY OF ROOM IS :- SUPER DELUXE ROOM");
            break;

            default :
            System.out.println("SORRY INPUT ERRIR OR NO DISCOUNT AVAILABLE FOR YOU. ");
            return; 
        }
        System.out.println("NUMBER OF DAYS YOU ARE RESIDING IN THE HOTEL :- " + days);
        System.out.println("THANK YOU FOR RESIDING IN OUR HOTEL"+n1 +n2);
    }
}

            
