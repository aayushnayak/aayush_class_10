import java.util.*;
public class Array_frequency_of_elements_in_array {
    public static void main(String argts[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT IN THE ARRAY :- ");
        int l= sc.nextInt();
        int input[]=new int[l];
        int i;
        int t;
        int c=0;
        System.out.println("ENTER THE  INTEGER ELEMENTS OF THE ARRAY ONE BY ONE :- ");
        for(i=0;i<l;i++){
            input[i]=sc.nextInt();
        }
        System.out.println("THE ELEMENTS OF THE ARRAY ENTERED BY THE USER ARE :-");
        for(i=0;i<l;i++){
            System.out.println(input[i]);
        }
        System.out.println("ENTER THE ELEMENT WHOSE FREQUENCY YOU WANT TO FIND :-");
        t=sc.nextInt();
        for(i=0;i<l;i++){
            if(input[i]==t)
                c++;

        }
        System.out.println("THE FREQUENCY OF THE ELEMENT "+t+" IS "+c);

    }
}
