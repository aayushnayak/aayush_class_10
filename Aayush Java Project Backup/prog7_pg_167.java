
import java.util.*;
public class prog7_pg_167 {
    public static void main(String args[]) {
            Scanner in =  new Scanner(System.in);
            System.out.println("Enter a Number:");
            int n = in.nextInt();
            int a=0,b=1,c=0;
            while(true) {
                c=a+b;
                a=b;
                b=c;
                if(c==n) {
                    System.out.println("It is Present in Fiboacci Series:");
                    break;
                }
                else if(c>n) {
                    System.out.println("It is Not Present in Fibonacci Series:");
                    break;
                }
            }
        }
    }


