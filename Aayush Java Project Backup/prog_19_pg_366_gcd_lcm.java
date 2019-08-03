import java.util.*;
public class prog_19_pg_366_gcd_lcm {
    int gcd = 0;
    int lcm;
    void Glcm(){
        Scanner in = new Scanner(System.in);
        int a, b, i, p, gcd = 0;
        System.out.println("ENTER TWO NUMBERS ");
        a = in.nextInt();
        b = in.nextInt();
        p = a * b;
        for (i = 1; i < p; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        lcm=a*b/gcd;
        System.out.println(" THE GCD OF THE ENTERED NUMBERS IS : "+ lcm);
    }
}
