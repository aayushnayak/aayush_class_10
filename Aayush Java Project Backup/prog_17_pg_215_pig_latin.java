import java.util.*;

public class prog_17_pg_215_pig_latin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lengthofinput;//x
        int counter;//y
        String str1,str2;
        char letteroftheinput;letteroftheinput=0; //b
        String userinput;//str
        System.out.println("ENTER A STRING");
        userinput = sc.next();
        lengthofinput = userinput.length();
        System.out.println("THE PIG LATIN FORM OF THE ENTERED STRING IS");
        for (counter = 0; counter < lengthofinput; counter++)
        {
            letteroftheinput = (userinput.charAt(counter));
            if (letteroftheinput == 'a' || letteroftheinput == 'e' || letteroftheinput == 'i' || letteroftheinput == 'o' || letteroftheinput == 'u' || letteroftheinput == 'A' || letteroftheinput == 'E' || letteroftheinput == 'I' || letteroftheinput == 'O' || letteroftheinput == 'U')
            break;
        }
        str1=userinput.substring(counter,lengthofinput);
        str2=userinput.substring(0,counter);
        System.out.println("counter= "+counter);
        System.out.println("lengthofinput= "+lengthofinput);
        System.out.println("str1= "+str1);
        System.out.println("str2= "+str2);
        System.out.println(str1+str2+"ay");

    }
}
