import java.util.*;
public class prog_27_pg_368_display_function_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_27_pg_368_display_function_2 obj=new prog_27_pg_368_display_function_2();
        System.out.println("ENTER 1] IF YOU WANT TO CHECK AND PRINT WHETHER THE NUMBER IS PERFECT SQUARE NUMBER OR NOT ");
        System.out.println("ENTER 2] IF YOU WANT TO CHECK AND PRINT WHETHER THE ENTERED STRING CONTAINS THE ENTERED CHARACTER OR NOT");
        System.out.println("ENTER 3] IF YOU WANT TO CHECK AND PRINT NUMBER OF SPECIAL CHARACTERS IN THE ENTERED STRING ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '1':
                System.out.println("ENTER A NUMBER TO CHECK WHETHER THE NUMBER IS PERFECT NUMBER OR NOT ");
                int n = sc.nextInt();
               // obj.display(n);
                break;
            case '2':
                System.out.println("ENTER A STRING AND A CHARACTER TO CHECK AND PRINT WHETHER THE ENTERED STRING CONTAINS THE ENTERED CHARACTER OR NOT ");
                String st = sc.next();
                char c = sc.next().charAt(0);
                // obj.display(st, c);
                break;
            case '3':
                System.out.println("ENTER A STRING TO CHECK PRINT NUMBER OF SPECIAL CHARACTERS IN THE ENTERED STRING  ");
                String st1 = sc.next();
                //obj.display(st1);
                break;
            default:
                System.out.println("SORRY SOMETHING WENT WRONG!");
                System.out.println("PLEASE ENTER THE CHOICE PROPERLY");
                return;
        }
    }
}