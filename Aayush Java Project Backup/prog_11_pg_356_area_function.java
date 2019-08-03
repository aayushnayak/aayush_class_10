import java.util.*;
public class prog_11_pg_356_area_function {
   double area(double a,double b,double c){
       double s,ar;
       s=(a+b+c)/2;
       ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       return ar;
   }
    double area(int a,int b,int height){
        double ar;
        ar=1.0/2.0*height*(a+b);
        return ar;
    }
    double area(double diagnol1,double diagnol2){
        double ar;
        ar=1.0/2.0*(diagnol1*diagnol2);
        return ar;
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
        prog_11_pg_356_area_function obj=new prog_11_pg_356_area_function();
        System.out.println();
        System.out.println(obj.area(10,3,6));
        System.out.println(obj.area(3.0,5.0));
    }
}
