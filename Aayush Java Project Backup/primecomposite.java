import java.util.*;
public class primecomposite
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("PLEASE  ENTER  A  NUMBER   :-  " );
        int n = sc.nextInt();
        int x=0;
        int y=2;
        int z= 1;
        boolean a=(n+z)%y==x;
        if(n==2)
            System.out.println("THE NUMBER ENTERED IS A PRIME NUMBER AS IT IS DIVISIBLE BY 1 AND THE NUMBER ENRERERD ONLY");
        else if(n==0 || n==1)
            System.out.println("THE NUMBER ENTERED IS NEITHER PRIME NOR COMPOSITE NUMBER AS IT IS ONLY DIVIVSIBLE BY THE NUMBER ENTEReD ");
        else if(a)
            System.out.println("THE NUMBER ENTERED IS A PRIME NUMBER AS IT IS DIVISIBLE BY 1 AND THE NUMBER ENRERERD ONLY");

        else
            System.out.println("THE NUMBER ENTERED IS A COMPOSITE NUMBER AS IT IS NOT ONLY DIVISIBLE BY  1 AND THE NUMBER ENRERERD ONLY BUT IS DIVIVSIBLE BY MANY OTHER NUMBERS");

    }
}

