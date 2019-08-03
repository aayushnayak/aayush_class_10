import java.util.*;
public class prog_22_pg_367_manip_function {
void manip(String str,int p){
    int length=str.length();
    for( int i=0;i<length;i++){
        char letter=str.charAt(i);
        if(p%2==0) {
            if (i % 2 == 0) {
                System.out.print(letter + "   ");

            }
        }
            else if(p%2!=0) {
                if(i%2!=0){
            System.out.print(letter + "   ");
        }
        }

    }

}
void manip(int a,char ch){
    if(ch=='s'){
        System.out.println("THE SQUARE ROOT OF THE NUMBER IS = "+Math.sqrt(a));
    }
    else{
        System.out.println("THE CUBE ROOT OF THE NUMBER IS = "+Math.cbrt(a));
    }



}
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    prog_22_pg_367_manip_function obj=new prog_22_pg_367_manip_function();
    System.out.println("ENTER 1]IF YOU WANT TO RUN FUNCTION NUMBER ONE ");
    System.out.println("ENTER 2]IF YOU WANT TO RUN FUNCTION NUMBER TWO");
    char choice=sc.next().charAt(0);

    switch(choice) {

        case '1':
            System.out.println("ENTER A STRING");
            String input_string = sc.next();
            System.out.println("ENTER A NUMBER");
            int input_integer = sc.nextInt();
            obj.manip(input_string, input_integer);
            break;
        case '2':
            System.out.println("ENTER A NUMBER");
            int input_integer2 = sc.nextInt();
            System.out.println("ENTER A CHARACTER");
            char input_character = sc.next().charAt(0);
            obj.manip(input_integer2, input_character);
            break;
        default:
            System.out.println("SORRYYYYYYYYYY");
            return;
    }
}
}
