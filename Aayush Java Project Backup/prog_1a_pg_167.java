import java.util.*;
class V1a {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No. of Terms:");
        int t = in.nextInt();
        int a=1;
        for(int i=1;i<=t;i++) {
            if(i%2==0) {
                System.out.print("-"+a+" ");
            }
            else {
                System.out.print(a+" ");
            }
            a+=2;
        }
    }
}