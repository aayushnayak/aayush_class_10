import java.util.*;
public class library_program {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF DAYS IT HAS BEEN SINCE YOU HAVE ISSUED THE BOKK");
        int days=sc.nextInt();
        int f1=50*days;
        int f2=100*days;
        int f3=150 *days;
        if(days<=5)
            System.out.println("THE LATE FINE IS "+ f1);
        else if(days>5 && days<=10)
            System.out.println("THE LATE FINE IS "+ f2);
        else if(days>10)
            System.out.println("THE LATE FINE IS "+ f3);
    }

}
