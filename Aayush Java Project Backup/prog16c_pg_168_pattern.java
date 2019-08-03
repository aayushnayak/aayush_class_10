import java.util.Scanner;

public class prog16c_pg_168_pattern
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Terms:");
        int i_input = in.nextInt();
        int i_firstno=2,i_sumab=0;
        for(int i=1;i<=i_input;i++) {
            if(i%2==0) {
                i_sumab-=i_firstno;
            }
            else {
                i_sumab+=i_firstno;
            }
            i_firstno+=2;
        }
        System.out.println("S="+i_sumab);
    }
}


