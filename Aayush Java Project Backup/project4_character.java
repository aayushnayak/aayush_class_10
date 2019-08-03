import java.util.*;
public class project4_character {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        char input=sc.next().charAt(0);
        if(Character.isDigit(input)){
            System.out.println(" CHARACTER ENTERED IS  A DIGIT  ");}
        else if(Character.isLetter(input)){
            System.out.println(" CHARACTER ENTERED IS A LETTER  ");
            if(Character.isUpperCase(input)){
                System.out.println(" THE CHARACTER ENTERED IS IN UPPER CASE:-  ");
                char l =Character.toLowerCase(input);
                System.out.println("CHANGING THE CHARACTER ENTERED INTO LOWER CASE:-  "+l);
            }
            else if(Character.isLowerCase(input))
                System.out.println(" THE CHARACTER ENTERED IS IN LOWER CASE:-  ");
            char u =Character.toUpperCase(input);
            System.out.println("CHANGING THE CHARACTER ENTERED INTO UPPER CASE:-  "+u);

        }


        else{
            System.out.println(" CHARACTER ENTERED IS A SPECAIL CHARACTER   ");}


    }
}
