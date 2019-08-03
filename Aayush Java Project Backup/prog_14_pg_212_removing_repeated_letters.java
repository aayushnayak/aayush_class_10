import java.util.*;

public class prog_14_pg_212_removing_repeated_letters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String userinput;//s1
        String finaloutput="";
        int useinputcounter1;//i
        int lengthoftheuserinput;//p
        char letteroftheinput;//ch1
        int counter2;//j
        boolean determiner;//t
        char letterofthestrings2;//ch2

        System.out.println("Enter a String but in lower Case only");
        userinput = sc.next();
        lengthoftheuserinput = userinput.length();
        for (useinputcounter1 = 0; useinputcounter1 < lengthoftheuserinput; useinputcounter1++) {
            letteroftheinput = userinput.charAt(useinputcounter1);
            determiner=true;//
            for(counter2=0;counter2<finaloutput.length();counter2++){
                letterofthestrings2=finaloutput.charAt(counter2);
                if(letteroftheinput==letterofthestrings2)
                    determiner=false;

            }
            if(determiner==true)
                finaloutput=finaloutput+letteroftheinput;

        }
        System.out.println("THE NEW STRING AFTER REMOVING DUPLICATE LETTERS IS : " );
        System.out.println(finaloutput);
    }
}
