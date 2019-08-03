import java.util.Scanner;

public class prog_7_pg_351_number_of_vowels_function {
    void display(String input){
        char chr;
        String st1 = " ";
        int p=input.length();

        for (int a = 0; a < p; a++) {

            chr = input.charAt(a);


            if ((chr >= 'a' && chr <= 'z')||(chr >= 'A' && chr <= 'Z')) {


                if(chr == 'a' ||chr == 'e' ||chr == 'i' ||chr == 'o' ||chr == 'u' ||chr == 'A' ||chr == 'E' ||chr == 'I' ||chr == 'O' ||chr == 'U' ){
                    System.out.println(chr);
                }
                   }



                   }

            }


        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER A STRING");
            String num = sc.nextLine();
            prog_7_pg_351_number_of_vowels_function obj=new prog_7_pg_351_number_of_vowels_function();
            obj.display(num);

        }
}
