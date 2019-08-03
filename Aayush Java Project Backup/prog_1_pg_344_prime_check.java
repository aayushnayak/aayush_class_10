import java.util.*;
public class prog_1_pg_344_prime_check {
    int check(int num) {
        int i;
        int f=0;
        int c=0;//factors
        for ( i = 1; i <= num ; i++) {

            if ( num % i == 0) {
              c=c+1;//increase the number of factors by 1

            }
        }
        if (c==2){
            f=1;
        }
        return f;

    }
    public static void main (String args[]){
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter any number:");
           //capture the input in an integer
           int a = scan.nextInt();
        prog_1_pg_344_prime_check obj = new prog_1_pg_344_prime_check();//creating object
            int k = obj.check(a);//calling fuction
           if(k==1)
           System.out.println(a + " is  a Prime Number");
        else
           System.out.println(a + " is not a Prime Number");
    }
}




