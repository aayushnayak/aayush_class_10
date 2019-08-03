import java.util.*;
public class prog_20_pg_217_convert_first_letter {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER A STRING");
        String input=sc.nextLine();
        input=' '+input;
        int length_of_input;
        String adding_a_space_to_the_input="";
        int counter;
        char letter_of_the_input;
        char goes_to_the_next_letter_of_the_input;
         length_of_input=input.length();
         for(counter=0;counter<length_of_input;counter++){
             letter_of_the_input=input.charAt(counter);
             if(letter_of_the_input==' '){
                 goes_to_the_next_letter_of_the_input=input.charAt(counter+1);
                 adding_a_space_to_the_input=adding_a_space_to_the_input+' '+Character.toUpperCase(goes_to_the_next_letter_of_the_input);
                 counter=counter+1 ;
             }
             else
                 adding_a_space_to_the_input=adding_a_space_to_the_input+letter_of_the_input;
         }
        System.out.println("THE NEW STRING IS ");
        System.out.println(adding_a_space_to_the_input);


    }
}
