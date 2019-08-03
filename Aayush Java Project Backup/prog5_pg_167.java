import java.util.*;
public class prog5_pg_167
{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        int sume=0,sumn=0,sumo=0;
        System.out.println("PRESS \"0\" TO TERMINATE ");
        do{
            System.out.print("ENTER");
            int a=sc.nextInt();
            if(a==0)
                break;
            else if(a<0)
                sumn+=a;
            else if(a%2==0)
                sume+=a;
            else
                sumo+=a;
        }
        while(true);
            System.out.println("SUM OF POSITIVE EVEN NUMBERS = "+sume);
            System.out.println("SUM OF POSITIVE ODD NUMBERS = "+sumo);
            System.out.println("SUM OF NEGATIVE  NUMBERS = "+sumn);

    }
}