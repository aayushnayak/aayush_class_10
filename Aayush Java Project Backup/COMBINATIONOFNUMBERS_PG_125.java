import java.util.Scanner;

public class COMBINATIONOFNUMBERS_PG_125 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER ");
        int n1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER ");
        int n2=sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER ");
        int n3=sc.nextInt();
        {
            if (n1 == n2 && n2 == n3 && n3 == n1)
                System.out.println("THEY ALL ARE EQUAL");
            else if (n1 > n2 && n2 > n3)
                System.out.println("THE GREATEST NUMBER IS = " + n1);
            else if (n1 < n2 && n3 < n2)
                System.out.println("THE GREATEST NUMBER IS = " + n2);
            else if ( n1>n2 && n2<n3 && n1>n3)
                System.out.println("THE GREATEST NUMBER IS = " + n1);

            else
                System.out.println("THE GREATEST NUMBER IS = " + n3);
        }
        {
            if(n1<0 && n2<0 && n3<0 )
            System.out.println("ALL NUMBERS ARE NEGATIVE ");
            else if(n1<0 || n2<0 || n3<0 )
                System.out.println("COMBINATION OF POSITIVE AND NEGATIVE ");
            else if(n1>0 && n2>0 && n3>0 )
                System.out.println("ALL NUMBERS ARE POSITIVE ");
           /* else if(n1<0 || n2>0 || n3<0 )
                System.out.println("COMBINATION OF POSITIVE AND NEGATIVE ");
            else if(n1<0 || n2<0 || n3>0 )
             *///   System.out.println("COMBINATION OF POSITIVE AND NEGATIVE ");
}
}
}






