import java.util.*;
public class prog_8_pg_352_volume_function {
    double vc,vs,vcd;
    void volume(int s){
        vc=s*s*s;
        System.out.println("THE VOLUME OF THE CUBE IS : "+vc);

    }
    void volume(float r){
        vs=1.34*3.147*r*r*r;
        System.out.println("THE VOLUME OF THE SPHERE IS : "+vs);
    }
    void volume(int l,int b,int h){
        vcd=l*b*h;
        System.out.println("THE VOLUME OF THE CUBOID IS : "+vcd);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIDE OF THE TO CUBE");
        int s=sc.nextInt();
        System.out.println("ENTER THE RADIUS OF THE TO SPHERE");
        float r=sc.nextFloat();
        System.out.println("ENTER THE LENGTH OF THE TO CUBOID");
        int l=sc.nextInt();
        System.out.println("ENTER THE BREATH OF THE TO CUBOID");
        int b=sc.nextInt();
        System.out.println("ENTER THE HEIGHT OF THE TO CUBOID");
        int h=sc.nextInt();
        prog_8_pg_352_volume_function obj= new prog_8_pg_352_volume_function();
        obj.volume(s);
        obj.volume(r);
        obj.volume(l,b,h);
    }
}
