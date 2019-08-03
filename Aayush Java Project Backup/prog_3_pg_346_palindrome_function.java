import java.util.*;
public class prog_3_pg_346_palindrome_function {
    int pal(int n){
       int p=0;
        int d;//digit
        int c;
       int r=0;//reverse
        c=n;//c is equal to original number
        do{
            d =n%10;
            r=r*10+d;
            n=n/10;
        }
        while(n!=0);
        if(r==c){
             p=1;
        }
        return p;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER :-");
        int num=sc.nextInt();
        prog_3_pg_346_palindrome_function obj=new prog_3_pg_346_palindrome_function();//creating object
        int k = obj.pal(num);//calling function
        if(k==1)
        System.out.println("THE NUMBER ENTERED IS A PALINDROME NUMBER :)");
        else
        System.out.println("THE NUMBER ENTERED IS NOT A PALINDROME NUMBER:(");
    }
}
