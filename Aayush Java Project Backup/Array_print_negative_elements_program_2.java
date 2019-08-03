public class Array_print_negative_elements_program_2 {
    public static void main(String args[]){
        int[] arr={1,-2,3,-4,5,-6};
        int l=arr.length;
        int i;
        System.out.println("THE NEGATIVE ELEMENTS OF THE ARRAY ARE : ");
        for(i=0;i<l;i++){
            if(arr[i]<0)
                System.out.print(arr[i]+"   ");

        }
    }

}
