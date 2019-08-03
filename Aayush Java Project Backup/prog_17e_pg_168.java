import java.util.*;
public class prog_17e_pg_168 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value of numerator :");
        int numerator =in.nextInt();
        System.out.println("Enter the value of denominator:");
        int denominator = in.nextInt();
        int sum=0;
        for(int i=2;i<=denominator;i++) {
            int fact=1;
            for(int j=1;i<=i;j++) {
                fact*=j;
            }
            if(i%2==0) {
                sum+=numerator/fact;
            }
            else {
                sum-=numerator/fact;
            }
        }
    }
}
