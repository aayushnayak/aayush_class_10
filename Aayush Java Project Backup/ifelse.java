import java.util.Scanner;

public class ifelse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE OF a");
        int a=sc.nextInt();
        System.out.println("ENTER VALUE OF b");
        int b=sc.nextInt();

        if(a==b)
        System.out.println("a is equal to b");
        else if (a>b)
        System.out.println(a + "is greater than" + b);
        else
        System.out.println(b + "is lesser than" +a);
    }
}
        
        