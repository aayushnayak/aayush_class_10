import java.util.*;
public class computer_project_p_129_26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE SHOWROOM PRICE OF THE CAR - ");
        int sprice = sc.nextInt();
        System.out.println("PLEASE ENTER THE NUMBER OF YEARS YOU USED THE CAR  - ");
        int no = sc.nextInt();
        System.out.println("THE ORIGNAL PRICE OF THE CAR IS  :- Rs. " + sprice);
        int a = sprice - (10 / 100 * sprice);
        int b = sprice - (20 / 100 * sprice);
        int c = sprice - (30 / 100 * sprice);
        int d = sprice - (50 / 100 * sprice);
        int e = sprice - (60 / 100 * sprice);
        int a1 = (10 / 100 * sprice);
        int b1 = (20 / 100 * sprice);
        int c1 = (30 / 100 * sprice);
        int d1 = (50 / 100 * sprice);
        int e1 = (60 / 100 * sprice);
        int y = (int) no;

        switch (y) {
            case '1':
                if (y == 1)
                    System.out.println("THE AMOUNT OF  DEPRICIATION  IS :- Rs. " + a1);
                System.out.println("THE AMOUNT TO BE PAID AFTER DEPRICIATION OF THE PRICE OF THE CAR IS :- Rs. " + a);
                break;

            case '2':
                if (y == 2)
                    System.out.println("THE AMOUNT OF  DEPRICIATION  IS :- Rs. " + b1);
                System.out.println("THE AMOUNT TO BE PAID AFTER DEPRICIATION OF THE PRICE OF THE CAR IS :- Rs. " + b);

                break;

            case '3':
                if (y == 3)
                    System.out.println("THE AMOUNT OF  DEPRICIATION  IS :- Rs. " + c1);
                System.out.println("THE AMOUNT TO BE PAID AFTER DEPRICIATION OF THE PRICE OF THE CAR IS :- Rs. " + c);

                break;

            case '4':
                if (y == 4)
                    System.out.println("THE AMOUNT OF  DEPRICIATION  IS :- Rs. " + d1);
                System.out.println("THE AMOUNT TO BE PAID AFTER DEPRICIATION OF THE PRICE OF THE CAR IS :- Rs. " + d);

                break;

            case '5':
                if (y > 4)
                    System.out.println("THE AMOUNT OF  DEPRICIATION  IS :- Rs. " + e1);
                System.out.println("THE AMOUNT TO BE PAID AFTER DEPRICIATION OF THE PRICE OF THE CAR IS :- Rs. " + e);

                break;

            default:
                System.out.println("SORRY INPUT ERROR . ");
                return;
        }
    }

}

 