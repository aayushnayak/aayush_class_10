import java.util.*;
public class prog_10_pg_365_discount_function {
    void Discount(double d,double p){
        double dp=(d/100)*p;
        double  amount=p-dp;
        System.out.println("THE AMOUNT AFTER THE DISCOUNT IS = "+amount);
    }
    void Discount(double  d1,double  d2,double  p){
        double  dp1=(d1/100)*p;
        double  amount1=p-dp1;
        double  dp2=(d2/100)*amount1;
        double  amount2=amount1-dp2;
        System.out.println("THE AMOUNT AFTER THE DISCOUNT IS = "+amount2);
    }
    void Discount(double  d1,double  d2,double  d3,double  p){
        double  dp1=(d1/100)*p;
        double  amount1=p-dp1;
        double  dp2=(d2/100)*amount1;
        double  amount2=amount1-dp2;
        double dp3=(d3/100)*amount2;
        double  amount3=amount2-dp3;
        System.out.println("THE AMOUNT AFTER THE DISCOUNT IS = "+amount3);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        prog_10_pg_365_discount_function obj= new prog_10_pg_365_discount_function();
        System.out.println("ENTER THE NUMBER OF DISCOUNTS[1,2,3]");
        int numd=sc.nextInt();
        if(numd==1){
            System.out.println("ENTER THE VALUE OF DISCOUNT ");
            int dis=sc.nextInt();
            System.out.println("ENTER THE AMOUNT ON WHICH THE DISCOUNT HAS TO BE APPLIED");
            int am=sc.nextInt();
            obj.Discount(dis,am);
        }
        else if(numd==2){
            System.out.println("ENTER THE VALUE OF FIRST DISCOUNT ");
            int dis1=sc.nextInt();
            System.out.println("ENTER THE VALUE OF SECOND DISCOUNT ");
            int dis2=sc.nextInt();
            System.out.println("ENTER THE AMOUNT ON WHICH THE DISCOUNT HAS TO BE APPLIED");
            int am=sc.nextInt();
            obj.Discount(dis1,dis2,am);
        }
        else if(numd==3){
            System.out.println("ENTER THE VALUE OF FIRST DISCOUNT ");
            int dis1=sc.nextInt();
            System.out.println("ENTER THE VALUE OF SECOND DISCOUNT ");
            int dis2=sc.nextInt();
            System.out.println("ENTER THE VALUE OF THIRD DISCOUNT ");
            int dis3=sc.nextInt();
            System.out.println("ENTER THE AMOUNT ON WHICH THE DISCOUNT HAS TO BE APPLIED");
            int am=sc.nextInt();
            obj.Discount(dis1,dis2,dis3,am);
        }

    }

}
