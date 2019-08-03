import java.util.*;
public class characterfunctions {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        char input=sc.next().charAt(0);
        boolean a,b,c,d,e;
         char f,g;
        a=Character.isDigit(input);
        b=Character.isLetter(input);
        c=Character.isLetterOrDigit(input);
        d=Character.isUpperCase(input);
        e=Character.isLowerCase(input);
        f=Character.toUpperCase(input);
        g=Character.toLowerCase(input);
        System.out.println("IS THE CHARACTER ENTERED A DIGIT:-  "+a);
        System.out.println("IS THE CHARACTER ENTERED A LETTER:-  "+b);
        System.out.println("IS THE CHARACTER ENTERED A LETTER OR DIGIT:-  "+c);
        System.out.println("IS THE CHARACTER ENTERED IS IN UPPER CASE:-  "+d);
        System.out.println("IS THE CHARACTER ENTERED IS IN LOWER CASE:-  "+e);
        System.out.println("CHANGING THE CHARACTER ENTERED INTO UPPER CASE:-  "+f);
        System.out.println("CHANGING THE CHARACTER ENTERED INTO LOWER CASE:-  "+g);
        
    }
}
