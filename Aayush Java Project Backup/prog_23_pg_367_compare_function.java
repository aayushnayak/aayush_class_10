import java.util.*;
public class prog_23_pg_367_compare_function {
    void compare(int n1,int n2){
        System.out.println("THE GREATER INTEGER IS = "+Math.max(n1,n2));
    }
    void compare(char c1,char c2){
        int a1=c1;
        int a2=c2;
        int max=Math.max(a1,a2);
        if(max==a1)
        System.out.println("THE CHARACTER WITH GREATER ASCII VALUE IS = "+c1);
        else
            System.out.println("THE CHARACTER WITH GREATER ASCII VALUE IS = "+c2);
    }
    void compare(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        int max=Math.max(l1,l2);
        if(max==l1)
            System.out.println("THE STRING WITH GREATER LENGTH IS =  "+s1);
        else
            System.out.println("THE STRING WITH GREATER LENGTH IS =  "+s2);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        prog_23_pg_367_compare_function obj=new prog_23_pg_367_compare_function();
        System.out.println("ENTER 1] IF YOU WANT TO COMPARE TWO INTEGERS");
        System.out.println("ENTER 2] IF YOU WANT TO COMPARE THE ASCII VALUE OF TWO CHARACTERS");
        System.out.println("ENTER 3] IF YOU WANT TO COMPARE THE LENGTH OF TWO STRINGS");
        char choice=sc.next().charAt(0);
        switch(choice){
            case '1':
                System.out.println("ENTER TWO NUMBERS ");
                int in1=sc.nextInt();
                int in2=sc.nextInt();
                obj.compare(in1,in2);
                break;
            case '2':
                System.out.println("ENTER TWO CHARACTERS ");
                char ic1=sc.next().charAt(0);
                char ic2=sc.next().charAt(0);
                obj.compare(ic1,ic2);
                break;
            case '3':
                System.out.println("ENTER TWO STRINGS ");
                String is1=sc.next();
                String is2=sc.next();
                obj.compare(is1,is2);
                break;
                default:
                    System.out.println("SORRYYYYYYYYY");
                    return;

        }

    }
}
