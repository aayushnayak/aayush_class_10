import java.util.*;

public class prog_2_pg_201_ASCII_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        String input = sc.nextLine();
        int p = input.length();
        char chr;

        for (int a = 0; a < p; a++) {

            chr = input.charAt(a);

            System.out.println(chr);
            if (chr >= 'a' && chr <= 'z') {
                char uc = Character.toUpperCase(chr);
                System.out.println("ENTERED CHARACTER CHANGED WITH ITS CASE :: " + uc);
                int ascii = (int) uc;
                System.out.println("THE ASCII CODE OF THE  CHARACTER IS  " + ascii);
            } else if (chr >= 'A' && chr <= 'Z') {
                char lc = Character.toLowerCase(chr);
                System.out.println("ENTERED CHARACTER CHANGED WITH ITS CASE :: " + lc);
                int ascii = (int) lc;
                System.out.println("THE ASCII CODE OF THE  CHARACTER IS  " + ascii);
            }
        }
    }
}





