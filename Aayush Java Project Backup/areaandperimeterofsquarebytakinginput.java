import java.util.*;
public class areaandperimeterofsquarebytakinginput
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SIDES ");
        int s=sc.nextInt();

        int a,p;
        a = s*s ;
        p = 4*s ;
        System.out.println("area = " + a);
        System.out.println("perimeter = " + p);
    }
}
