import java.util.*;
public class modulus {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER WHOSE MODULUS YOU WANT TO FIND : ");
        int n=sc.nextInt();
        System.out.println("ENTER THE THE SECOND NUMBER : ");
        int n2=sc.nextInt();
        int mod=n%n2;
        System.out.println("THE MODULUS VALUE [REMAINDER] VALUE OF THE ENTERED NUMBERS IS : "+ mod);
    }
}
