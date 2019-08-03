import java.util.*;
public class prog_17_pg_366_display_overload_function {
    void display(String str, int p) {
        int s = str.length();
        for (int a = 0; a < s; a++) {
            char chr = str.charAt(a);
            if(p==1){
            }
            if (chr >= 'A' && chr <= 'Z'){
                System.out.println(chr);

            }
            else if(chr >= 'a' && chr <= 'z' ){
                System.out.println(chr);
            }


        }
    }
    public static void main(String args[]){
        prog_17_pg_366_display_overload_function obj= new prog_17_pg_366_display_overload_function();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String at=sc.next();
        System.out.println("ENTER A NUMBER ");
        int b=sc.nextInt();
        obj.display(at,b);
    }
}
