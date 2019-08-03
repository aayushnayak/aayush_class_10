import java.util.*;
public class Array_sum_of_numbers_divisible_by_3_pg_264 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i;
        int sum=0;
        int array[]= new int[10];
        System.out.println("ENTER THE 10 ELEMENTS FOR THE ARRAY :-");
        for(i=0;i<10;i++){
            array[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            if(array[i]%3==0||array[i]%5==0)
                sum=sum+array[i];
        }
        System.out.println("THE SUM OF NUMBERS IS "+sum);
    }
}
