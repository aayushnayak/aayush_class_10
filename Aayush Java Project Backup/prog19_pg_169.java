import java.util.Scanner;

public class prog19_pg_169 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines:");
        int l = in.nextInt();
        for(int i=1;i<=l;i++) {
            for(int j=1;j<=i;j++) {
                if(j%2==0){
                    System.out.print("#");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }


}
