import java.util.*;
public class prog_10_pg_208_initials_string {
    public static void main(String args[]) {
        String st, sn, st1 = "", st2 = "";
        int i, p;
        char chr;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A FULL NAME");
        st = sc.nextLine();
        st = ' ' + st;//adds a space[' '] in the start of the entered string
        p = st.lastIndexOf(' ');//checks the last position of space[' '] in the entered string
        sn = st.substring(p);//separates the left string after the last position of p[last position of space[' '] ]
        for (i = 0; i < p; i++) {
            chr = st.charAt(i);
            if (chr == ' ')
                st1 = st1 + st.charAt(i + 1) + '.';//if the chr is space then it jumps to the next character which is not a string
        }
        st2 = st1 + sn;
        System.out.println("NAME AS INITIAL WITH SURNAME");
        System.out.println(st2);
    }
}
