
 public class differenceofcompoundinterestPAGENUMBER_80 
 {
     public static void main(String args[])
     {  
         int p,r,t;
         double si,ci=0,amt,diff=0;
         p=8000;r=10;t=2;
         si=p*r*t/100.0;
         amt=p*(Math.pow(1+r/100.0,t));
         ci=amt-p; 
         
         diff = ci-si;
         System.out.println("THE COMPOUND INTERST IS = Rs " + (float)ci);
         System.out.println("THE SIMPLE INTEREST IS = Rs " + si);
         System.out.println("THE DIFFERENCE BETWEEN COMPOUND INTEREST AND SIMPLE INTEREST IS  = Rs" +(float)diff);
        }
    }
