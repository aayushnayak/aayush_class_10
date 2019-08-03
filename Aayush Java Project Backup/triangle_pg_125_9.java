import java.util.*;
public class triangle_pg_125_9
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("PLEASE  ENTER THE FIRST SIDE[BASE] OF THE TRIANGLE   :-  " );
        int b = sc.nextInt();
        System.out.println("PLEASE  ENTER THE SECOND SIDE OF THE TRIANGLE   :-  " );
        int s2 = sc.nextInt();
        System.out.println("PLEASE  ENTER THE THIRD SIDE OF THE TRIANGLE   :-  " );
        int s3 = sc.nextInt();
        System.out.println("PLEASE  ENTER THE HEIGHT OF THE TRIANGLE   :-  " );
        int h = sc.nextInt();
        int p= b+s2+s3;
        int a=1/2*b*h;

        if(p==a)
            System.out.println("THE TRIANGLE IS AN EQUABLE TRIANGLE");
        else 
            System.out.println("THE TRIANGLE IS NOT AN EQUABLE TRIANGLE ");
    }
}

