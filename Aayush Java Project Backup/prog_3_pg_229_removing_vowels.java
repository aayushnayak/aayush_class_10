import java.util.*;
 public class prog_3_pg_229_removing_vowels {
     public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.println("ENTER A STRING");
         String input = sc.nextLine();
         int p = input.length();
         int l = 0;
         int u = 0;
         int d = 0;
         int sp = 0;
         int v=0;
         int con=0;
         char chr;
         String st1 = " ";
         System.out.println("DISPLAYED IN VERTICAL PATTERN :");
         for (int a = 0; a < p; a++) {

             chr = input.charAt(a);

             System.out.println(chr);
             if (chr >= 'a' && chr <= 'z') {

                 l += 1;

                 char uc = Character.toUpperCase(chr);
                 st1 = st1 + uc;
                 if(chr == 'a' ||chr == 'e' ||chr == 'i' ||chr == 'o' ||chr == 'u' ){
                     v+=1;}
                 else
                     con=con+1;
             }


             else if (chr >= 'A' && chr <= 'Z') {
                 u += 1;
                 char lc = Character.toLowerCase(chr);
                 st1 = st1 + lc;
                 if(chr == 'A' ||chr == 'E' ||chr == 'I' ||chr == 'O' ||chr == 'U' ){
                     v+=1;}
                 else
                     con=con+1;

             }

             else if (chr >= '0' && chr <= '9') {
                 d += 1;
             } else {
                 sp += 1;
             }
         }

         System.out.println(" NUMBER OF UPPER CASE:-  " + u);
         System.out.println(" NUMBER OF LOWER CASE:-  " + l);
         System.out.println(" NUMBER OF DIGITS:-  " + d);
         System.out.println(" NUMBER OF SPECAIL CHARACTERS:-  " + sp);
         System.out.println("ENTERED STRING CHANGED WITH ITS CASE :: "+st1);
         System.out.println("NUMBER OF VOWELS IN THE STRING : "+v);
         System.out.println("NUMBER OF CONSONANTS IN THE STRING : "+con);

     }
}
