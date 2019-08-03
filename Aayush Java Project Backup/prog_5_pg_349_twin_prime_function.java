import java.util.*;
public class prog_5_pg_349_twin_prime_function {
    int twin(int n){
        int i;
        int c=0;
        int f=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                c=c+1;
        }
        if(c==2)
            f=1;
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,p,x,y;
        System.out.println("ENTER YOUR FIRST NUMBER ");
        m=sc.nextInt();
        System.out.println("ENTER YOUR SECOND NUMBER ");
        p=sc.nextInt();
        prog_5_pg_349_twin_prime_function obj= new prog_5_pg_349_twin_prime_function();
        x=obj.twin(m);
        y=obj.twin(p);
        if((x==1 && y==1)&&(m-p==2||p-m==2))
            System.out.println("TWIN PRIME");
        else
            System.out.println(" NOT TWIN PRIME");
    }
}
