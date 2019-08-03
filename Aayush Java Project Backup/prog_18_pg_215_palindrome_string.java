import java.util.*;
public class prog_18_pg_215_palindrome_string {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input;
        System.out.println("ENTER A STRING[IN LOWER CASE ONLY]");
         input=sc.nextLine();
        String output="";
        char letterofinput;
        int lengthofinput=input.length();
        for(int counter=lengthofinput-1;counter>=0;counter--){
             letterofinput=input.charAt(counter);
            output=output+letterofinput;
        }
        boolean equal=input.equals(output);
        if(equal==true)
            System.out.println(" THE ENTERED STRING IS PALINDROME");
        else
            System.out.println(" THE ENTERED STRING IS NOT PALINDROME");
    }
}
