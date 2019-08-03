import java.util.*;
public class movieMagic {
    int year;
    String title;
    float rating;
    void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE  TITLE OF THE MOVIE :-");
        title=sc.nextLine();
        System.out.println("ENTER THE RELEASE YEAR OF THE MOVIE :-");
        year=sc.nextInt();
        System.out.println("ENTER THE  RATING  FOR THE MOVIE [MINIMUM - 0.0 ; MAXIMUM - 5.0]  :-");
        rating=sc.nextFloat();
    }
    void display(){
        String f= "FLOP";
        String s= "SEMI - HIT";
        String h= "HIT";
        String su= "SUPER HIT";
        System.out.println(" THE TITLE OF THE MOVIE :- "+title );
        if(rating>=0.0 && rating<=2.0)
            System.out.println(" THE MOVIE  IS   :- " + f);
        else if(rating>=2.1 && rating<=3.4)
            System.out.println(" THE MOVIE  IS   :- " + s);
        else if(rating>=3.5 && rating<=4.5)
            System.out.println(" THE MOVIE  IS   :- " + h);
        else
            System.out.println(" THE MOVIE  IS   :- " + su);
    }

   public static void main(String [] args){
        movieMagic m=new movieMagic();
        m.accept();
        m.display();
    }
}
