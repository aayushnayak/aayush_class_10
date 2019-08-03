import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prog10_pg_150 {
    public static void main (String args []) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter the value of the numerator");
        double a=Double.parseDouble(br.readLine());
        System.out.println("Enter the limit for the denominator");
        int limit=Integer.parseInt(br.readLine());
        double n=1.0;
        double sum=0.0;
        while(n<=limit)
        {
            sum=+(a/n);
            n++;
        }
        System.out.println(sum);
    }
}
