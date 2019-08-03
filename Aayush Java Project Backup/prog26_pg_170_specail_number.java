import java.util.Scanner;

public class prog26_pg_170_specail_number {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = in.nextInt();
        int copy=n,sum=0;
        while(copy!=0) {
            int f=1;
            int d=copy%10;
            for(int i=1;i<=d;i++) {
                f*=i;
            }
            sum+=f;
            copy/=10;
        }
        if(sum==n) {
            System.out.println("It is a Special Number.");
        }
        else {
            System.out.println("It is not a Special Number.");
        }
    }
}

