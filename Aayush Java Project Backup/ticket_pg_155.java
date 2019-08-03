import java.util.*;
public class ticket_pg_155 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int i,p=0;
            double d=0, amt=0;
            String name;
            for(i=1;i<=15;i++)
            {
                System.out.println("ENTER NAME OF THE CUSTOMER ");
                name=sc.nextLine();
                System.out.println("ENTER THE AMOUNT OF THE TICKET ");
                sc.nextInt();
                if(p<25001)
                    d=p*2.0/100.0;
                if(p>25001 && p<=35000)
                    d=p*10.0/100.0;
                if(p>35001 && p<=55000)
                    d=p*12.0/100.0;
                if(p>55001 && p<=70000)
                    d=p*16.0/100.0;
                if(p>70000)
                    d=p*18.0/100.0;
                amt=(p-d);
                System.out.println("S1.NO\tNAME\t\tTICKET CHARGE\t\tDISCOUNT\tNET AMOUNT ");
                System.out.println(i+"\t"+name+"\t\t"+p+"\t\t"+amt);

            }
        }
    }
}
