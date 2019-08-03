import java.util.*;
public class Array_Linear_Search_With_Integers {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int array[]= new int[10];
        int l=array.length;
        int i;
        int f;
        System.out.println("ENTER THE 10 ELEMENTS FOR THE ARRAY :-");
        for(i=0;i<10;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("ENTER ANY ELEMENT OF THE  ARRAY  :-");
        int s=sc.nextInt();
        int present=0;



        for(i=0;i<l;i++){
            f=array[i];
            if(f==s)
                present++;

        }
        if(present==1)
        System.out.println("THE ENTERED ELEMENT IS PRESENT IN THE ARRAY");
        else
        System.out.println("THE ENTERED ELEMENT IS NOT PRESENT IN THE ARRAY");



    }
}
