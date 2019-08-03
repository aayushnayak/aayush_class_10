import java.util.*;

public class prog_12_pg_210_frequency_String_manipulation {
    public static void main(String args[]) {
        String st, st1 , st2 = "";
        int i, p, f = 0;
        char chr;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A STRING OR A LINE ");
        st = in.nextLine();
        System.out.println("ENTER THE WORD TO BE SEARCHED IN THE STRING");
        st1 = in.nextLine();
        st = st + ' ';
        p = st.length();
        for (i = 0; i < p; i++) {
            chr = st.charAt(i);
            if (chr == ' ') {
                if (st2.compareTo(st1) == 0)
                    f = f + 1;
                st2 = "";

            } else
                st2 = st2 + chr;
        }
        System.out.println("FREQUENCY OF THE WORD IS " + f);
    }
}
