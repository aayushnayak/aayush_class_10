import java.util.*;
public class INTEREST_p_125_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double i1,i2,i3;

        System.out.println("PLEASE ENTER PRINCIPAL - ");
        double p = sc.nextDouble();
        double r = 5;
        double t= 3;
  
        double x = p+(p*5*1/100);
        double y = p+((p+(p*5*1/100))*5*1/100);
        double z =p+(p+((p+(p*5*1/100))*5*1/100));
        

        i1= p*5*1/100;                              
        i2=x*5*1/100;
        i3=y*5*1/100;
     
        
        

        System.out.println("PRICIPAL :- " + p);
        System.out.println("RATE OF INTEREST :- "+ r);
        System.out.println("TIME/TIME PERIOD/TENURE :- " + t);
        System.out.println("COMPOUND INTEREST FOR FIRST YEAR IS  :- " + i1);
         System.out.println("COMPUND INTEREST FOR SECOND YEAR IS  :- " + i2);
          System.out.println("COMPUND INTEREST FOR THIRD YEAR IS  :- " + i3);
          System.out.println("AMOUNT AFTER  THIRD YEAR IS  :- " + z); 

    }
}

