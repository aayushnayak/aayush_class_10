import java.util.Scanner;
public class METERABAAP {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a No.:");
        int n = in.nextInt();
        int a=0 ;

        int c=0;
        while(n==0) {
            int d=n%10;
            n=n/10;
            System.out.println(d);

            if(d==0)
            {
                continue;
            }
            else
            {
                a=a+d*(int)Math.pow(c,10);
                c++;
            }
        }
        System.out.println("The new no.= ");
    }
}
