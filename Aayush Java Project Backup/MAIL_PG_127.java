import java.util.Scanner;

public class MAIL_PG_127 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c,a1,b1,c1;
        int w;
        String O= " ORDINARY MAIL"  ;
        String E ="EXPRESS MAIL ";

        int n1=1;
        int n2=2;



        System.out.println("PLEASE ENTER YOUR NAME - ");
        String name = sc.next();
        System.out.println("CHOOSE CATEGORY  FROM ({ORDINARY MAIL[O]};{EXPRESS MAIL[E] )");
        char cat = sc.next().charAt(0);
        System.out.println("PLEASE ENTER THE WEIGHT OF THE PARCEL [IN GRAMS]- ");
        w = sc.nextInt();
        a=50;
        b=40/100*w;
        c=35/100*w;


        a1=80;
        b1=70/100*w;
        c1=65/100*w;

System.out.println();

        System.out.println("YOUR MAIL DETAILS  :- ");
        System.out.println();
        System.out.println("NAME :- "+ name);
        System.out.println();




        switch(cat)
        {
            case 'O'   :
                if( w>=100  )
                    System.out.println("CHARGES FOR THE MAIL IS  = Rs. "+ a );

                else if (w>100 && w<=500)
                    System.out.println("CHARGES FOR THE MAIL IS  = Rs. " +b);

                else if(w>500 )
                    System.out.println("CHARGES FOR THE MAIL IS  = Rs. " + c);
                System.out.println("THE CATEGORY OF MAIL IS :- ORDINARY MAIL");
                break;

            case 'E':
                if( w>=100  )
                    System.out.println("CHARGES FOR THE MAIL IS = Rs. "+ a1 );

                else if (w>100 && w<=500)
                    System.out.println("CHARGES FOR THE MAIL IS= Rs. " +b1);

                else if( w>500)
                    System.out.println("CHARGES FOR THE MAIL IS= Rs. " + c1);
                System.out.println("THE CATEGORY OF MAIL IS :- DELUXE EXPRESS MAIL");
                break;



            default :
                System.out.println("SOMETHING WENT WRONG PLEASE TRY AGAIN :) ");
                return;


        }
        System.out.println();
        System.out.println("YOUR MAIL REQUEST HAS BEEN SENT !");
        System.out.println();
        System.out.println("THANK YOU :)");

    }
}
