import java.util.*;
public class buzz_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS A BUZZ NUMBER OR NOT ");
        int n = sc.nextInt();
        if(n%10==7 || n%7==0)
        {
            System.out.println(n+" is a Buzz Number.");
        }
        else
        {
            System.out.println(n+" is not a Buzz Number.");
        }
    }
}
