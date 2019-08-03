import java.util.Scanner;
public class prog1d_pg_167 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No. of Terms:");
        int t = in.nextInt();
        int a=2,diff=3;
        for(int i=2;i<=t;i++) {  //
            System.out.print(a+" ");
            a+=diff;
            diff+=2;
        }
    }
}

