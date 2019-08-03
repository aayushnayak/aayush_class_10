import java.util.*;
public class prog_1_pg_229_sum_and_difference_of_ASCII {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER TWO CHARACTERS RESPECTIVELY");
        char input1=sc.next().charAt(0);
        char input2=sc.next().charAt(0);
        int ascii_for_input1=(int)input1;
        int ascii_for_input2=(int)input2;
        System.out.println("THE ASCII CODE FOR THE FIRST INPUT IS "+ascii_for_input1);
        System.out.println("THE ASCII CODE FOR THE SECOND INPUT IS "+ascii_for_input2);
        int sum_of_ascii=ascii_for_input1+ascii_for_input2;
        int difference_of_ascii=ascii_for_input1-ascii_for_input2;
        int abs=Math.abs(difference_of_ascii);
        System.out.println("THE SUM OF THE ASCII CODES IS  "+sum_of_ascii);
        System.out.println("THE DIFFERENCE OF THE ASCII CODES IS "+abs);

    }
}
