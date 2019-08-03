import java.util.*;
public class average_using_user_defined_functions {
    int n1,n2,n3,a;
    void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :-");
        n1=sc.nextInt();
        System.out.println("ENTER THE  SECOND NUMBER :-");
        n2=sc.nextInt();
        System.out.println("ENTER THE  THIRD NUMBER :-");
        n3=sc.nextInt();
    }
    void  calculation(){
        a=(n1+n2+n3)/2;
    }
    void dispaly(){
        System.out.println("THE AVERAGE OF THE ENTERED NUMBERS IS :- "+a);
    }
    public static void main(String [] args){
        average_using_user_defined_functions a= new average_using_user_defined_functions();
        a.accept();
        a.calculation();
        a.dispaly();
    }
}
