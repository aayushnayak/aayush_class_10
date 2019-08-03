import java.util.Scanner;
public class spy_number {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int i = in.nextInt();
    int s=0,p=1;
    while(i!=0) {
        int d=i%10;//extracting the digit
        s+=d;//adding
        p*=d;//multiplying
        i/=10;//dividing
    }
    if(s==p) {
        System.out.println("It is a Sum-Product Number.");
    }
    else {

        System.out.println("It is not a Sum-Product Number");
    }
}
}


