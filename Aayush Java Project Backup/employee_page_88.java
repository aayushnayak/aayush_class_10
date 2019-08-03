import java.util.*;
public class employee_page_88
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER EMPLOYEE'S NAME AND BASIC SALARY ");
        double basic,da,hra,pf,gp= 0,np = 0;
        String empn ;
        empn = in.nextLine();
        basic = in.nextInt();
        da = basic*25.0/100.;
        hra = basic *15.0/100.0;
        pf=basic*8.33/100.0;
        gp=basic +da + hra;
        np = gp-pf;
        System.out.println("NAME OF THE EMPLOYEE  =  " + empn);
        System.out.println("GROSS PAY   =  " + gp);
        System.out.println("NET PAY   =  " + np);
    }
}