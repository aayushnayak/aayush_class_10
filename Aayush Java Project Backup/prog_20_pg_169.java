import java.util.Scanner;
public class prog_20_pg_169 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines:");
        int l = in.nextInt();
        for(int i=1;i<=l;i++) {
            for(int j=i*2-1;j>=1;j-=2) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
