import java.util.*;
public class Array_ascending_order_pf_270 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A WORD :-");
        String input=sc.next();
        int length=input.length();
        System.out.println("THE NUMBER OF LETTERS IN THE ENTERED WORD ARE :- "+length);


         int i;
        char array[]=new char[length];
        System.out.println("THE LETTERS OF THE WORD ARE AS FOLLOWS :- ");
        for(i=0;i<length;i++){
            array[i]=input.charAt(i);
            System.out.println(array[i]+" ");
        }
        char t;

        for(i=0;i<length-1;i++){
            for(int j=(i+1);j<length;j++){
            int c=array[i];
            int c2 = array[j];
            if (c >c2){
                t=array[i];
                array[i]=array[j];
                array[j]=t;
            }
            }


        }
        System.out.println("THE LETTERS ARRANGED IN ASCENDING ORDER ARE :- ");
        for(i=0;i<length;i++){
            System.out.println(array[i]);
        }

    }
}
