import java.util.*;
public class prog_19_pg_216_alphabetical_order {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int counter1,counter2,lengthofinput;

        String input;
        char letterofinput;
        System.out.println("ENTER A STRING");
        input=sc.next();
        lengthofinput=input.length();
        for(counter1=65;counter1<=90;counter1++){
            for(counter2=0;counter2<lengthofinput;counter2++) {
                letterofinput = input.charAt(counter2);
                int small = counter1 + 32;
                if (letterofinput == (char) counter1 || letterofinput == (char) small)
                    System.out.print(letterofinput);
            }
        }
    }
}
