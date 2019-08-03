import java.util. *;
public class totalsalaryusingscanner
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        double bsal,totsal=0;
        System.out.println("ENTER YOUR BASIC SALARY");
        bsal = sc.nextDouble();
        double a,b,c;
        a= bsal*0.25;
        b= bsal*0.15;
        c= bsal*0.1;
        totsal = bsal + a+ b+ c;
        System.out.println("YOUR TOTAL SALARY IS  = " + totsal);
    }
}
 