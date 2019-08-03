import java.util.*;
public class box_office_yash_program {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAME OF THE MOVIE ");
        String mov=sc.next();
        System.out.println("ENTER THE NUMBER OF DAYS FROM THE RELEASE DATE OF THE MOVIE");
        int days=sc.nextInt();
        System.out.println("ENTER THE AMOUNT OF DAILY COLLECTION");
        int daily=sc.nextInt();
        int box;
        box=daily*days;
        System.out.println("THE NAME THE MOVIE IS : "+mov);
        System.out.println("NUMBER OF DAYS FROM THE RELEASE DATE OF THE MOVIE IS : "+days);
        System.out.println("AMOUNT OF DAILY COLLECTION IS :"+daily);
        System.out.println("THE BOX OFFICE IS :0"+ box);
    }
}
