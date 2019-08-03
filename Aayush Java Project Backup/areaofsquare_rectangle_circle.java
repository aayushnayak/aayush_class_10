import java.util.Scanner;

public class areaofsquare_rectangle_circle {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String S="SQUARE";
        String R="RECTANGLE";
        String C="CIRCLE";
        System.out.println("PLEASE ENTER  THE SIDE OF THE SQUARE  :- ");
        int  side = sc.nextInt();
        System.out.println("PLEASE ENTER THE LENGTH OF  THE RECTANGLE   :- ");
        int  l = sc.nextInt();
        System.out.println("PLEASE ENTER THE BREATH OF THE RECTANGLE  :- ");
        int  b = sc.nextInt();
        System.out.println("PLEASE ENTER THE RADIUS OF THE CIRCLE  :- ");
        int  r = sc.nextInt();
        System.out.println("WHICH AMONG THE FIGURES UOU WANT TO FIND THE AREA OF  :- 1-SQUARE(S)|2-RECTANGLE(R)|3-CIRCLE(C)");
        char cat = sc.next().charAt(0);
        double aos= side*side;
        double aor=l*b;
        double aoc=2*22/7*(r*r);
        switch(cat)
        {
            case 'S':
                System.out.println("AREA OF THE SQUARE IS  :- "+aos);
                break;
            case 'R':
                System.out.println("AREA OF THE RECTANGLE IS :- "+aor);
                break;
            case 'C':
                System.out.println("AREA OF THE CIRCLE IS :- "+aoc);
                break;
            default:
                System.out.println("SOMETHING WENT WRONG , PLEASE TRY AGAIN :)");
                return;
        }
    }
}


