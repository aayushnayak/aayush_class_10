import java.util.*;
public class Grade_10_project_4_array_seven_wonders {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i;
        String f;

        String wonder[] = {"Taj Mahal", "Colosseum  ", " Chichen Itza ", "Machu Picchu ", " Christ the Redeemer ", "Petra  ", "Great Wall of China "};
         String country[] = {"India", "Italy", "Mexico", "Peru", "Brazil", "Jordan", "China"};

        int j;


        System.out.println("ENTER THE NAME OF THE COUNTRY WHOSE SEVEN WONDER IS TO BE SEARCHED  :-");
        String s = sc.next();
        int present = 0;

        for (i = 0; i < 7; i++) {
            f = country[i];
            if (f.equals(s)) {
                present = 1;
                break;
            } else
                present = 0;
        }
        if (present == 1)
            System.out.println("THE NAME OF THE COUNTRY IS " + country[i] + " AND ITS WONDER IS " + wonder[i]);
        else
            System.out.println("COUNTRY  NOT FOUND");


    }
}
