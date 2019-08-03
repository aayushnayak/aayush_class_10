import java.util.Scanner;

public class prog8_pg_167 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = in.nextInt();//input
        int product=1;
        System.out.println("The Even Digits are:");
        while(a!=0){
            int d=a%10;//remainder of a/10
            if(d%2==0) {
                System.out.print(d+" ");
                product=product*(d+1);
            }
            a=a/10;
        }
        System.out.println("The Product of Their Successors are:"+product);
    }
}

