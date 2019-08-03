import java.util.*;
public class prog_11_pg_365_area_parallo_function {

    void Areap(){
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER THE BASE AND HEIGHT OF THE PARALLELOGRAM RESPECTIVELY ");
        int b=sc.nextInt();
        int h=sc.nextInt();
        int area=b*h;
        System.out.println("THE AREA OF THE PARALLELOGRAM IS : "+area);

    }
    void Arear(){
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER THE VALUE OF THE FIRST DIAGNOL AND SECOND DIAGNOL RESPECTIVELY ");
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int area=(1/2)*d1*d2;
        System.out.println("THE AREA OF THE RHOMBUS IS : "+area);

    }
    void Areat(){
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER THE VALUES OF THE PARALLEL SIDES AND HEIGHT OF THE TRAPEZIUM RESPECTIVELY");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int area=(1/2)*(a+b)*h;
        System.out.println("THE AREA OF THE TRAPEZIUM IS : "+area);
    }

    public static void  main(String args[]) {
        prog_11_pg_365_area_parallo_function obj = new prog_11_pg_365_area_parallo_function();
        obj.Areap();
        obj.Arear();
        obj.Areat();
    }
}
