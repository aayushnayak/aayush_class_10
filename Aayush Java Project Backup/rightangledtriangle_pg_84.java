import java.io.*;
public class rightangledtriangle_pg_84 {
    public static void main (String []args)throws IOException
    {
        int p,b;
        double h,ar,pm;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("ENTER PERPENDICULAR AND BASE OF THE TRIANGLE ");
        p=Integer.parseInt(in.readLine());
        b= Integer.parseInt(in.readLine());
        h=Math.sqrt(p*p+b*b);
        ar=1.0/2.0*p*p;
        pm=(p+b+h);
        System.out.println("HYPOTENUSE OF THE TRIANGLE = "+h);
        System.out.println("AREA OF THE TRIANGLE = "+ar);
        System.out.println("PERIMETER OF THE TRIANGLE = "+pm);
    }
}
