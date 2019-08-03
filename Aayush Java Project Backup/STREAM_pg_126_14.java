import java.util.*;
public class STREAM_pg_126_14
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("PLEASE  ENTER THE MARKS OF SCIENCE OUT OF 100  :-  " );
        int s = sc.nextInt();
        System.out.println("PLEASE  ENTER THE MARKS OF MATHS  OUT OF 100 :-  " );
        int m = sc.nextInt();
        System.out.println("PLEASE  ENTER THE MARKS OF ENGLISH  OUT OF 100  :-  " );
        int e = sc.nextInt();

        double ems= (e+m+s)/300*100;
        double es = (e+s)/200*100;

        if(ems>=80)
            System.out.println("PURE SCIENCE");
        else if (ems>=60)
        System.out.println("BIO.SCIENCE ");
        else if(es>=60)
        System.out.println("COMMERECE ");
    }
}

