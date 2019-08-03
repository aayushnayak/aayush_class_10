import java.util.Scanner;

public class areanadperimeterofrectanglebytakinginput
{
   public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH");
        int l=sc.nextInt();
        System.out.println("ENTER THE BREATH");
        int b=sc.nextInt();



        int a,p;
        a=l*b;
        p = 2*(l + b);
        System.out.println("area = " + a);
        System.out.println("perimeter = " + p);
    }
}