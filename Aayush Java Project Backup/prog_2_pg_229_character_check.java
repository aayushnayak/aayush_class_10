import java.util.*;
public class prog_2_pg_229_character_check {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        char input= sc.next().charAt(0);
        if(input>='a' && input<='z')
            System.out.println("THE ENTERED STRING IS A LETTER AND IS IN LOWER CASE");
        else if(input>='A' && input<='Z')
            System.out.println("THE ENTERED STRING IS A LETTER AND IS IN UPPERCASE CASE");
        else if(input>='0' && input<='9')
            System.out.println("THE ENTERED STRING IS A DIGIT");
        else
            System.out.println("THE ENTERED STRING IS A SPECAIL CHARACTER");
    }

}
