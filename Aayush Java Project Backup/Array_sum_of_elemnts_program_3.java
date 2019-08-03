public class Array_sum_of_elemnts_program_3 {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int l=arr.length;
        int i;
        int sum=0;
        System.out.println("THE SUM OF THE ELEMENTS OF THE ARRAY IS : ");
        for(i=0;i<l;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
