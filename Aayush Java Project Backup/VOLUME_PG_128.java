import java.util.Scanner;

public class VOLUME_PG_128 {
    public static void main(String args[])
    {
        System. out. println ("press 1 for cube\npress2 for cuboid\npress3 for sphere");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
                System. out. println ("Enter the length of cube");
                int l=sc.nextInt();
                System. out. println ("volume is "+(l*l*l));
                break;
            case 2:
                System. out. println ("Enter the length,breadth and height");
                int ll=sc.nextInt();
                int b=sc.nextInt();
                int h=sc.nextInt();
                System. out. println ("volume is"+(ll*b*h));
                break;
            case 3:
                System. out. println ("Enter the radius of sphere");
                int r=sc.nextInt();
                System. out. println ("volume is "+(4/3*22/7*r*r*r*r));
                break;
            default:
                System. out. println ("invalid choice ");
        }
    }
}



