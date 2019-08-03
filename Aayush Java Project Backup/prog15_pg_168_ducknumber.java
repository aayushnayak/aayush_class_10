import java.util.Scanner;
public class prog15_pg_168_ducknumber
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number.");
        int i_input = in.nextInt();
        int c=0;//did not understand the role of variable c
        while(i_input!=0) {
            int i_digit=i_input%10;
            if(i_digit==0) {
                System.out.println("It is a Duck Number.");
                c=1;
                break;
            }
            i_input/=10;
        }
        if(c==0) {
            System.out.println("It is not a Duck Number.");
        }
    }//main
}
