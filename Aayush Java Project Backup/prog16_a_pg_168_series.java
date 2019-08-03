import java.util.*;//did not understand the logic
public class prog16_a_pg_168_series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int i_input = in.nextInt();
        int i_firstno=9,i_secondno=99,i_sumab=0;
        for(int counter=1;counter<=i_input;counter++){
            i_sumab+=(i_firstno+i_secondno);
            i_firstno-=1;//a=a-1
            i_secondno-=10;//b=b-10
        }
        System.out.println("S="+i_sumab);
    }
}