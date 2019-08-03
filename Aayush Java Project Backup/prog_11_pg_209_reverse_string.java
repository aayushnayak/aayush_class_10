import java.util.*;
public class prog_11_pg_209_reverse_string {
public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    String st,st1=" ",st2=" ";
    int i,p;
    char chr;
    System.out.println("ENTER A STRING");
    st=sc.nextLine();
    st=st+' ';
    p=st.length();
    for(i=0;i<p;i++)
    {
        chr=st.charAt(i);
        if(chr==' ')
        {
            st2=st2+ ' '+st1;
            st1=" ";
        }

        else
            st1=chr+st1;

    }
    System.out.println(st2);

}
}
