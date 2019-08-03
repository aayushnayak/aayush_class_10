import java.util.*;
public class prog_9_pg_353_buzz_composite_switch_case_function {
    void num() {
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOU CHOICE TO CHECK WHETHER THE NUMBER IS [1]COMPOSITE;[2]BUZZ ");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:
                System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS  COMPOSITE  OR PRIME :");//capture the input in an integer
                int num = sc.nextInt();
                for (int i = 2; i <= num / 2; i++) {
                    temp = num % i;
                    if (temp == 0) {
                        isPrime = false;
                        break;
                    }
                }
                //If isPrime is true then the number is prime else not
                if (isPrime)
                    System.out.println(num + " is a Prime Number");
                else
                    System.out.println(num + " is a Composite Number");
                break;
            case 2:
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
                break;
            default:
                System.out.println("WRONGGGGGGGG");
        }
    }
    public static void main(String args[]){
        prog_9_pg_353_buzz_composite_switch_case_function obj= new prog_9_pg_353_buzz_composite_switch_case_function ();
        obj.num();
    }



}
