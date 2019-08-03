import java.util.*;
public class prog_2_pg_345_series {
    int  sum(int n){

        int i;//counter
        int s=0;//sum
        for(i=1;i<=n;i++) {
            s = s +(i*(i+1));
        }
        return s;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TERMS ");
        int num=sc.nextInt();
        prog_2_pg_345_series obj= new prog_2_pg_345_series();// creating object
        int k=obj.sum(num);//calling function
        System.out.println("THE SUM IS= "+ k);
         }
}
