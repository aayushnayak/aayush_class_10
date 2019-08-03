import java.util.*;
public class prog22_pg159_palindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER :-");
        int n=sc.nextInt();
        int r,d,c;
        r=0;
        c=n;
        do{
            d =n%10;
            r=r*10+d;
            n=n/10;
        }
        while(n!=0);
        if(r==c)
            System.out.println("THE NUMBER ENTERD IS A PALLADROME NUMBER :)");
        else
            System.out.println("THE NUMBER ENTERED IS NOT A PALLANDROME NUMBER:(");
    }
}
