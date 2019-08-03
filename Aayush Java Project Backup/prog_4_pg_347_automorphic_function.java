import java.util.*;
public class prog_4_pg_347_automorphic_function {
    int auto(int num){


        int p;
        int f=0;
        p=num*num;
        do {
            {
                if(num%10!=p%10)
                {
                    f=1;
                    break;
                }
                else {
                    num=num/10;
                    p=p/10;
                }
            }
        }
        while(num>0);
        return f;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        prog_4_pg_347_automorphic_function obj= new prog_4_pg_347_automorphic_function();
       int k=obj.auto( n);
        if(k==0)
            System.out.println("AUTOMORPHIC NUMBER ");
        else
            System.out.println("NOT AN AUTOMORPHIC NUMBER ");
    }

}
