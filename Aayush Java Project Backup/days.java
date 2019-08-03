import java.util.Scanner;

public class days
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF DAYS");
        int x=sc.nextInt();

        int b = x/365;
        int c = x%365;
        int d = c/30;
        int e = d%30;
        
        System.out.println(b + " YEARS ");
        System.out.println(e + " MONTHS ");
        System.out.println( c + " DAYS ");
    }
}