import java.util.*;
public class NIVENNUMBER_PG_148 {
    public static void main(String args [])
    {
        Scanner in= new Scanner(System.in);
        int num,sum=0,d,p;
        System.out.println("ENTER A NUMBER");
        num=in.nextInt();
        p=num;
        do {
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
        while(num!=0);
        if(p%sum==0)
            System.out.println("NIVEN NUMBER");
        else
            System.out.println("NOT A NIVEN NUMBER");


    }
}
