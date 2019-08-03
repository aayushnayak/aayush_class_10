import java.util.*;
public class prog13_pg_168_primeandnextprime
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number.");
        int i_input = in.nextInt();
        int f=0;
        for(int i=1;i<=i_input;i++) {
            if(i_input%i==0){
                f++;
            }
        }
        if(f==2) {
            System.out.println("It is a Prime Number.");
        }
        else {
            while(true) {
                f=0;
                i_input++;
                for(int i=1;i<=i_input;i++) {
                    if(i_input%i==0) {
                        f++;
                    }
                }
                if(f==2) {
                    System.out.println("It is not a Prime Number.");
                    System.out.println("The Next Prime: "+i_input);
                    break;
                }
            }
        }
    }
}
