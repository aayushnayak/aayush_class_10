import java.util.*;
public class HAPPYNUMBER_PG_149 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,sum=0,d;
        System.out.println("ENTER A NUMBER");
        num=sc.nextInt();
        sum=num;
        do {
            num=sum;sum=0;
            do{
                d=num%10;
                sum=sum+d*d;
                num=num/10;
            }
            while(num>0);


        }
        while(sum>9);
        if(sum==1)
            System.out.println("HAPPY NUMBER :)");
        else
            System.out.println("NOT AHAPPY NUMBER :(");
    }
}
