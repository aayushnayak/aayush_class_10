import java.util.Scanner;

public class prog_17_j_pg169 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value of A:");
        int a = in.nextInt();
        System.out.println("Enter the Number of Terms:");
        int t = in.nextInt();
        double sum = a, exp = 3, d = 5;
        for (int i = 2; i <= t; i++) {
            if (i % 2 == 0) {
                sum -= (int) (Math.pow(a, exp)) / d;
            } else {
                sum += (int) (Math.pow(a, exp)) / d;
            }
            exp += 2;
            d += 4;
        }
        System.out.println("S=" + sum);

    }
}