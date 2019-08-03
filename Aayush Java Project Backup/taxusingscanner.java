import java.util. *;
public class taxusingscanner
{
     public static void  taxusingscanner()
    {
        Scanner sc = new Scanner(System.in);
        double annsal,tax =0;
        System.out.println("ENTER THE ANUAL SALARY");
        annsal = sc.nextDouble();
        if(annsal <= 150000)
        tax= 0;
        else if (annsal> 15000 && annsal<= 300000)
        tax = (annsal - 150000)*0.1;
        else if(annsal>300000 && annsal<= 500000)
        tax = (annsal- 300000)*0.2 + 15000;
        else if(annsal>500000)
        tax= (annsal-500000)*0.3 + 55000;
        System.out.println("income tax is" + tax);
    }
}
        
        
        
    
    