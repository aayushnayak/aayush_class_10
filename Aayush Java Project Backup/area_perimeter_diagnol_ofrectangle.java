import java.util.*;
public class area_perimeter_diagnol_ofrectangle {
    public static void main(String[]args)
    {
        String A="AREA";
        String P="PERIMETER";
        String D="DIAGONAL";
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE LENGTH OF  THE RECTANGLE   :- ");
        int  l = sc.nextInt();
        System.out.println("PLEASE ENTER THE BREATH OF THE RECTANGLE  :- ");
        int  b = sc.nextInt();
        System.out.println("WHAT DO YOU WANT TO FIND?  :- 1-AREA(A)|2-PERIMETER(P)|3-DIAGNOL(D)");
        char cat = sc.next().charAt(0);
        double area= l*b;
        double x= l*l+b*b;
        double perimeter=2*(l+b);
        double diagnol=Math.sqrt(x);
        switch(cat)
        {
            case 'A':
                System.out.println("AREA OF THE RECTANGLE  :- "+area);
                break;
            case 'P':
                System.out.println("PERIMETER  OF THE RECTANGLE IS :- "+perimeter);
                break;
            case 'D':
                System.out.println("DIAGNOL OF THE RECTANGLE :- "+diagnol);
                break;
            default:
                System.out.println("SOMETHING WENT WRONG , PLEASE TRY AGAIN :)");
                return;
        }
    }
}





