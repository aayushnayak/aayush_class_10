import java.util.*;
public class possibletriangle_pg_97 {
    public static void main(String []args)
    {
        Scanner in =new Scanner(System.in);
        int a,b,c;
        System.out.println("ENTER THREE SIDES OF A TRIANGLE");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if((a+b>c)&&(b+c>a)&&(c+a>b))
        {
            System.out.println("TRIANGLE IS POSSIBLE");
          if((a==b)&&(b==c)&&(c==a))
              System.out.println("TRIANGLE IS EQUILATERAL");
            if((a!=b)&&(b!=c)&&(c!=a))
                System.out.println("TRIANGLE IS SCALENE");

        }
        else
            System.out.println("TRIANGLE IS NOT POSSIBLE");
    }
}
