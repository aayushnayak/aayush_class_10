import java.util.*;
public class computerproject3_b
{
    public static void main(String args  [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS(BETWEEN 1 AND 9) BELOW :");
         System.out.println("ENTER THE FIRST NUMBER :");
         int n1=sc.nextInt();
         System.out.println("ENTER THE SECOND NUMBER :");
         int n2=sc.nextInt();
         System.out.println("ENTER THE THIRD NUMBER :");
         int n3=sc.nextInt();
         int s=n1+n2+n3;
         int g2=(n3*100)+(n2*10)+(n1);
         
         
         System.out.println("THE SUM OF THE DIGITS OF THE NUMBER  IS :-"+s);
    System.out.println("THE REVERSED NUMBER FORMED BY THE ENTERED DIGITS IS :-"+g2);
}
}