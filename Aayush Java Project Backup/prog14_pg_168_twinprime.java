import java.util.*;//did not understand the logic
public class prog14_pg_168_twinprime
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number.");
        int a = in.nextInt();
        System.out.println("Enter 2nd Number.");
        int b = in.nextInt();
        int f=0;
        boolean a2=false,b2=true;
        for(int i=1;i<=a;i++) {
            if(a%i==0){
                f++;
            }
        }
        if(f==2){
            a2=true;
        }
        f=0;
        for(int i=1;i<=b;i++) {
            if(b%i==0) {
                f++;
            }
        }
        if(f==2){
            b2=true;
        }
        if(a2==b2 && Math.abs(a-b)==2) {
            System.out.println("They are Twin Prime Numbers.");
        }
        else {
            System.out.println("They are not Twin Prime Numbers.");
        }
    }
}
