//2 5 10 17 
import java.util.*;
class V1b {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No. of Terms:");
        int t = in.nextInt();
        int a=2,diff=3;
        for(int i=1;i<=t;i++) {  //
            System.out.print(a+" ");
            a+=diff;
            diff+=2;
        }
    }
}