import java.util.*;
public class goodsdicount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR TOTAL SALES");
        int sales=sc.nextInt();
        double a,b,c,d,x,y,z,q;
        a=5/100*7500;
        b=10/100*sales;
        c=15/100*sales;
        d=20/100*sales;
        x=sales-a;
        y=sales-b;
        z=sales-c;
        q=sales-d;

        switch(sales)
        {
            case '1': {
                if (sales <= 7500)
                    System.out.println("DISCOUNT AMOUNT = " + a);
                else
                    System.out.println("BYE");
            }
            System.out.println("AMOUNT = " + sales);
            System.out.println("DISCOUNT OFFERED  = 5%" );
            System.out.println("AMOUNT PAYABLE = " + x);
            break;

            case '2': {
                if (sales > 7500 && sales<=15000)
                    System.out.println("DISCOUNT AMOUNT = " + b);
                else
                    System.out.println("BYE");
            }
            System.out.println("AMOUNT = " + sales);
            System.out.println("DISCOUNT OFFERED  = 10%" );
            System.out.println("AMOUNT PAYABLE = " + y);
            break;
            case '3': {
                if (sales > 15000 && sales<=25000)
                    System.out.println("DISCOUNT AMOUNT = " + c);
                else
                    System.out.println("BYE");
            }
            System.out.println("AMOUNT = " + sales);
            System.out.println("DISCOUNT OFFERED  =  15%" );
            System.out.println("AMOUNT PAYABLE = " + z);
            break;
            case '4': {
                if (sales >25000)
                    System.out.println("DISCOUNT AMOUNT = " + d);
                else
                    System.out.println("BYE");
            }
            System.out.println("AMOUNT = " + sales);
            System.out.println("DISCOUNT OFFERED  = 20%" );
            System.out.println("AMOUNT PAYABLE = " + q);
            break;
            default:
                System.out.println("SOMETHING WENT WRONG");
                return;



        }



    }
}
