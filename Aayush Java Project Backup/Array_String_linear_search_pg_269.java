import java.util.*;
public class Array_String_linear_search_pg_269 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        int i;
        String f;
        System.out.println("ENTER THE NUMBER OF NAMES AND PHONE NUMBERS YOU WANT TO STORE :-");
        int l=sc.nextInt();
        String array[] = new String[l];
        long array2[]=new long[l];
        int j;

        for(i=0;i<l;i++){
            System.out.println("ENTER THE NAME :-");
            array[i]=sc.next();
            System.out.println("ENTER THE CORRESPONDING PHONE NUMBER :-");
            array2[i]=sc.nextLong();

        }

        System.out.println("ENTER THE NAME YOU WANT TO SEARCH  :-");
        String s=sc.next();
        int present=0;

        for(i=0;i<l;i++){
            f=array[i];
            if(f.equals(s)) {
                present=1;
                break;
            }
            else
                present=0;
        }
        if(present==1)
            System.out.println("THE NAME IS "+array[i]+" AND THE PHONE NUMBER IS "+array2[i]);
        else
            System.out.println("NAME NOT FOUND");



    }
}



