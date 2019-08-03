import java.util.*;
public class Array_binary_search_pg_266 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT IN THE ARRAY :-");
        int l= sc.nextInt();
        int array[]=new int[l];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY ONE BY ONE :-");
        for(int i=0;i<l;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("ENTER THE ELEMENT OF THE ARRAY THAT IS TO BE SEARCHED :- ");
        int input=sc.nextInt();
        int low=0;
        int high=l-1;
        int counter=0;
        int mid=0;
        while(low<=high) {
            mid = (low + high) / 2;
            if (array[mid] == input) {
                counter++;
                break;
            }
            if (array[mid] < input) {
                low = mid + 1;
            }
            if (array[mid] > input) {
                high = mid - 1;
            }
        }
        if(counter==1)
            System.out.println("THE ELEMENT IS AT INDEX NUMBER :-  "+(mid));
        else
            System.out.println("SOMETHING WENT WRONG ");
    }
}
