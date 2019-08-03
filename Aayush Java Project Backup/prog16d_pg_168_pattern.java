public class prog16d_pg_168_pattern
{
    public static void main(String args[]) {
        int i_sumab=0,i_firstno=1,i_secondno=2;
        for(int i=1;i<=20;i++) {
            i_sumab+=(i_firstno*i_secondno);
            i_firstno+=1;
            i_secondno+=1;
        }
        System.out.println("S="+i_sumab);
    }
}


