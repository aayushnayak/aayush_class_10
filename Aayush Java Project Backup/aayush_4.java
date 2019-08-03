import java.util.Scanner;
public class aayush_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int n1 = n / 10;
        int n2 = n % 10;
        int s = n1 + n2;
        int p = n1 * n2;
        int sp = s + p;
        if (sp == n)
            System.out.println("specail number");
        else
            System.out.println("not a specail number");

    }
}

