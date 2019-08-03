public class prog_16f_pg_168_series {
    public static void main(String args[]) {
        int i_sum=0;
        for(int i=1;i<=9;i++) {
            int i_product=1;
            i_sum+=i;
            for(int j=1;j<=i+1;j++) {
                i_product*=j;
            }
            i_sum+=i_product;
        }
         System.out.println("S="+i_sum);
     }
}
