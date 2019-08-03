import java.util.*;
public class basicsalary_p_126_14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double e,a,bs;

        char y ='F';
        char x = 'M'    ;
        

        System.out.println("PLEASE ENTER YOUR NAME - ");
        String n = sc.next();
        System.out.println("PLEASE ENTER YOUR EMPLOYEE NUMBER");
        e = sc.nextInt();
        System.out.println("PLEASE ENTER YOUR AGE - ");
        a = sc.nextInt();
        System.out.println("PLEASE ENTER YOUR GENDER[M][F] - ");
        char g = sc.next().charAt(0);
        // String g = sc.next();
        System.out.println("PLEASE ENTER YOUR  MONTHLY BASIC SALARY - ");
        bs = sc.nextInt();
        double hra =40/100*bs;
        double pf=12/100*bs;
        double epf=2/100*bs;
        double mgs=bs+hra;
        double ags=12*mgs;
        double mns = mgs-(pf+epf);
        double ans=12*mns;

        System.out.println("YOUR MONTHLY GROSS SALARY IS :- "+hra);
        System.out.println("YOUR ANNUAL GROSS SALRY IS  :- "+ ags);
        System.out.println("YOUR MONTHLY NET  SALRY IS  :- "+ mns);
        System.out.println("YOUR ANNUAL  NET  SALRY IS  :- "+ ans);

       // switch(g)
      // {
           // case 'x'      :
            if( g==x && ags<=250000 )
                System.out.println("YOU ARE NOT AN INCOME TAX PAYER ");

            else if(g==y && ags<=300000)
                System.out.println("YOU ARE NOT AN INCOME TAX PAYER " );

          //  break;
          //  case 'y':
           // if( ags>=300000)
           //     System.out.println("YOU ARE NOT AN INCOME TAX PAYER " );

            else 
                System.out.println("YOU ARE A INCOME TAX PAYER " );

          //  break;
            
           // default :
           // System.out.println("SORRY INPUT ERROR ");
           // return; 
        }

    }
//}

