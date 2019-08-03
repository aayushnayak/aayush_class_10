import java.util.Scanner;//DID NOT UNDERSTAND THE QUESTION

public class prog16b_pg_168_pattern
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Terms:");
        int i_input = in.nextInt();
        int i_firstno=1,i_secondno=1,i_c=0,i_sumab=0;
        for(int i=1;i<=i_input;i++) {
            i_sumab+=(i_firstno+i_secondno);
            i_c=i_firstno+i_secondno;
            i_firstno=i_secondno;
            i_secondno=i_c;
        }
        System.out.println("S="+i_sumab);
    }
}
