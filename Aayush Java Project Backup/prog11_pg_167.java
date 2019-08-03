import java.util.*;//did not understand the logic
public class prog11_pg_167 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int i_input = in.nextInt();
        int i_sameasinput = i_input, i_no_of_digits = 0, i_unique = 0;


        while (i_sameasinput != 0) {
            i_no_of_digits++;
            i_sameasinput = i_sameasinput / 10;
        }
        i_sameasinput = i_input;

        Loop:
        for (int i = 1; i <= i_no_of_digits; i++) {
            int d = i_sameasinput % 10;
            int copy2 = i_input / (int) (Math.pow(10, i));
            for (int j = 1; j <= i_no_of_digits; j++) {
                int di = copy2 % 10;
                if (d == di) {
                    System.out.println("It is not a Unqiue Number.");
                    i_unique = 1;
                    break Loop;
                }
                copy2 = i_sameasinput / 10;
            }
            i_sameasinput= i_sameasinput / 10;
        }
        if (i_unique != 1) {
            System.out.println("It is a Unique Number.");
        }
    }
}








