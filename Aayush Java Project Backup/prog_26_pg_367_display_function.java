import java.util.*;
public class prog_26_pg_367_display_function {
    void display(int num) {
        double sq=Math.sqrt(num);
        double div=num/sq;
        if (div==sq)
            System.out.println("THE ENTERED NUMBER IS A PERFECT SQUARE");
        else
            System.out.println("NOT A PERFECT SQUARE NUMBER ");

    }

    void display(String str, char ch) {
        int length = str.length();
        int counter=0;
        for (int i = 0; i < length; i++) {

            char alpha = str.charAt(i);
            {
                if (alpha == ch) {
                    counter = counter + 1;
                }

            }

        }
        {if(counter>0)
            System.out.println("THE ENTERED STRING CONTAINS THE ENTERED CHARACTER ");
        else
            System.out.println("DOES NOT CONTAIN");
        }
    }

    void display(String str) {
        int sp=0;


        for (int a = 0; a < str.length(); a++) {

            char chr = str.charAt(a);
            {
                if (chr >= 'a' && chr <= 'z') {
                    int l = 0;
                    l += 1;

                } else if (chr >= 'A' && chr <= 'Z') {
                    int u = 0;
                    u += 1;


                } else if (chr >= '0' && chr <= '9') {
                    int d = 0;
                    d += 1;
                } else {

                    sp += 1;

                }
            }
            {

            }
        }
        System.out.println("THE NUMBER OF SPECIAL CHARACTERS IN THE ENTERED STRING IS  " + sp);

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_26_pg_367_display_function obj = new prog_26_pg_367_display_function();
        System.out.println("ENTER 1] IF YOU WANT TO CHECK AND PRINT WHETHER THE NUMBER IS PERFECT SQUARE NUMBER OR NOT ");
        System.out.println("ENTER 2] IF YOU WANT TO CHECK AND PRINT WHETHER THE ENTERED STRING CONTAINS THE ENTERED CHARACTER OR NOT");
        System.out.println("ENTER 3] IF YOU WANT TO CHECK AND PRINT NUMBER OF SPECIAL CHARACTERS IN THE ENTERED STRING ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '1':
                System.out.println("ENTER A NUMBER TO CHECK WHETHER THE NUMBER IS PERFECT NUMBER OR NOT ");
                int n = sc.nextInt();
                obj.display(n);
                break;
            case '2':
                System.out.println("ENTER A STRING AND A CHARACTER TO CHECK AND PRINT WHETHER THE ENTERED STRING CONTAINS THE ENTERED CHARACTER OR NOT ");
                String st = sc.next();
                char c = sc.next().charAt(0);
                obj.display(st, c);
                break;
            case '3':
                System.out.println("ENTER A STRING TO CHECK PRINT NUMBER OF SPECIAL CHARACTERS IN THE ENTERED STRING  ");
                String st1 = sc.next();
                obj.display(st1);
                break;
            default:
                System.out.println("SORRY SOMETHING WENT WRONG!");
                System.out.println("PLEASE ENTER THE CHOICE PROPERLY");
                return;

        }
    }
}
