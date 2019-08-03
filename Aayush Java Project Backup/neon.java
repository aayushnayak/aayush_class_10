import java.util.*;
public class neon {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:)");
        int n=sc.nextInt();
        int p, s = 0, d;
        p = n * n;
        do {
            {
                d = p % 10;
                s = s + d;
                p = p / 10;
            }


        } while (p != 0);
        if (s == n)
            System.out.println("IT IS A NEON NUMBER!");
        else
            System.out.println("IT IS NOT A NEON NUMBER:(");

    }
}
