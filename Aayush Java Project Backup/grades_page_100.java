import java.io.*;
public class  grades_page_100
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in  = new BufferedReader(read);
        int m ;
        String nm ;
        System.out.println("ENTER NAME OF THE STUDENT");
        nm = in.readLine();
        System.out.println("ENTER THE AVERAGE MARKS OBTAINED");
        m = Integer.parseInt(in.readLine());
        System.out.println("STUDENT'S NAME : " + nm );
        if(m>80)
        System.out.println("GRADE : DISTINCTION");
        if(m>=60&&m<80)
        System.out.println("GRADE : DIVISION");
        if(m>=45&&m<60)
        System.out.println("GRADE : PASS");
        if(m<40)
        System.out.println("NO GRADE" );
    }
}
        
        