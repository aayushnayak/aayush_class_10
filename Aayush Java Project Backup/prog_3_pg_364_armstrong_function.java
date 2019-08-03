import java.util.*;
public class prog_3_pg_364_armstrong_function {
    void arm(int n){
        int a,num,s=0;
        num=n;
        while(n>0) {
            a = n % 10;
            s = s + a * a * a;
            n = n / 10;
        }
        if(num==s)
            System.out.println(" ARMSTRONG NUMBER---1");
        else
            System.out.println(" NOT ARMSTRONG NUMBER----0");


    }
    public static void main(String args [] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int input = sc.nextInt();
        prog_3_pg_364_armstrong_function obj=new prog_3_pg_364_armstrong_function();
        obj.arm(input);

    }
}
