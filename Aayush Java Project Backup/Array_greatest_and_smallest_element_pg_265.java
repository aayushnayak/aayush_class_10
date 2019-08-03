import java.util.*;
public class Array_greatest_and_smallest_element_pg_265 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i;
        int sum=0;
        int array[]= new int[10];

        System.out.println("ENTER THE 10 ELEMENTS FOR THE ARRAY :-");
        for(i=0;i<10;i++){
            array[i]=sc.nextInt();
        }
        int min =array[0];
        int max=array[0];
        for(i=0;i<10;i++){
            if(array[i]>max)
                max=array[i];

           else if(array[i]<min)
               min=array[i];

        }
        System.out.println("THE GREATEST ELEMENT IS "+max);
        System.out.println("THE SMALLEST ELEMENT IS "+min);

    }
}

