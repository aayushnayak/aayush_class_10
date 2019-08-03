import java.util.Scanner;
public class prog_17d_pg_168 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value of Numerator[a]:");
        int numerator=in.nextInt();
        System.out.println("Enter the Number of Terms[n]:");
        int terms = in.nextInt();
        int sum=0;
        for(int counter=1;counter<=terms;counter++) {
            if(counter%2==0) {
                sum-=numerator/counter;
            }
            else {
                sum+=counter;
            }
        }
        System.out.println("S = " +sum);
    }
}

