import java.util.*;
public class Array_names_whose_first_letter_matches_pg_273 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int i;
        String f;
        System.out.println("ENTER THE NUMBER OF NAMES YOU WANT TO STORE :-");
        int l=sc.nextInt();
        String names[] = new String[l];

        System.out.println("ENTER THE NAMES ONE BY ONE :-");
        for(i=0;i<l;i++){

            names[i]=sc.next();
        }


        System.out.println("ENTER THE FIRST LETTER SO THAT I COULD SHOW YOU THE NAMES STARING WITH WITH THE LETTER  :-");
        char s=sc.next().charAt(0);
        int present=0;
        char let;
        System.out.println("THE NAMES ARE :-");

        for(i=0;i<l;i++) {
            f = names[i];
            let = f.charAt(0);
            if (let == (s)) {
                present++;



            } else{
                present = 0;}

            if (present > 0){
                System.out.println(names[i] + " ");}
            else{
                System.out.println(" ");}
        }





    }
}


