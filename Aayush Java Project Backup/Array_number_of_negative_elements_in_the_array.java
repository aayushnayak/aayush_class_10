import java.util.*;
public class Array_number_of_negative_elements_in_the_array {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT IN THE ARRAY :- ");
     int l=sc.nextInt();
     System.out.println("ENTER THE NUMBERS ONE BY ONE :-");
     int i;
     int c=0;
     int input[]=new int[l];
     for(i=0;i<l;i++){
         input[i]=sc.nextInt();
         if(input[i]<0)
             c++;
     }
     System.out.println("THE NUMBER OF NEGATIVE ELEMENTS IN THE ARRAY IS :-  "+c);

    }
}
