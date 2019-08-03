import java.util.Scanner;

public class prog_8_pg_365_area_function {
    void area(){
        Scanner sc=new Scanner(System.in);
        String S="SQUARE";
        String R="RECTANGLE";
        String C="CIRCLE";
        System.out.println("PLEASE ENTER  THE SIDE OF THE SQUARE  :- ");
        int  side = sc.nextInt();
        System.out.println("PLEASE ENTER THE LENGTH OF  THE RECTANGLE   :- ");
        int  l = sc.nextInt();
        System.out.println("PLEASE ENTER THE BREATH OF THE RECTANGLE  :- ");
        int  b = sc.nextInt();
        System.out.println("PLEASE ENTER THE RADIUS OF THE CIRCLE  :- ");
        int  r = sc.nextInt();
        double aos= side*side;
        double aor=l*b;
        double aoc=2*22/7*(r*r);
        System.out.println("AREA OF THE SQUARE IS  :- "+aos);
        System.out.println("AREA OF THE RECTANGLE IS :- "+aor);
        System.out.println("AREA OF THE CIRCLE IS :- "+aoc);
    }
    public static void main(String args []){
        prog_8_pg_365_area_function obj= new prog_8_pg_365_area_function();
        obj.area();
    }
}
