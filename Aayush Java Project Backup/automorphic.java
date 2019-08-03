import java.util.*;
public class automorphic {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num=sc.nextInt();

        int p;
        int f=0;
        p=num*num;
        do {
            {
                if(num%10!=p%10)
                {
                    f=1;
                    break;
                }
                else {
                    num=num/10;
                    p=p/10;
                }
            }
        }
        while(num>0);
            if(f==0)
                System.out.println("  AUTOMORPHIC NUMBER ");
            else
                System.out.println("  NOT AUTOMORPHIC NUMBER ");
        }
    }

