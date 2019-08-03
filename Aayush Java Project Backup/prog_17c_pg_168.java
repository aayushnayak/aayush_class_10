import java.util.*;
public class prog_17c_pg_168 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMERATOR[a]");
        int i_numerator=sc.nextInt();
        System.out.println("ENTER THE denominator[a]");
        int i_denominator=sc.nextInt();
        int sum=0;
        int d=2;
        for(int counter=2;counter<=i_denominator;counter++){
             sum+=i_numerator/d;
             d+=2;
        }
        System.out.println("S = "+ sum );
    }
}
