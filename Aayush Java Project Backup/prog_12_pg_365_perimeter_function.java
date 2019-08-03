import java. util.*;
public class prog_12_pg_365_perimeter_function {
    void peris(){

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER LENGTH  OF SIDE ");
        int s=sc.nextInt();

        int a,p;
        a = s*s ;
        p = 4*s ;
        System.out.println("area = " + a);
        System.out.println("perimeter = " + p);
    }
    void perir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH");
        int l=sc.nextInt();
        System.out.println("ENTER THE BREATH");
        int b=sc.nextInt();



        int a,p;
        a=l*b;
        p = 2*(l + b);
        System.out.println("perimeter = " + p);
        System.out.println("area = " + a);
    }
    void peric(){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CIRCLE : ");
        double r=sc.nextInt();
        double p=2*3.147*r;
        System.out.println("perimeter = " + p);
    }
    public static void main(String args[]){
        prog_12_pg_365_perimeter_function obj=new prog_12_pg_365_perimeter_function();
        obj.peris();
        obj.peric();
        obj.perir();
    }

}
