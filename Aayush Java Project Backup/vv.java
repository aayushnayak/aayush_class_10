

 import java.util.*;
 public class vv
         {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR SUM OF MONEY :-");
        int p=sc.nextInt();
        System.out.print("PLEASE ENTER YOUR AGE");
        int age=sc.nextInt();
        System.out.println("PLEASE ENTER THE NUMBER OF YEARS FOR WHICH YOU WANT T0 INVEST");
        int t=sc.nextInt();

                if( age<60 &&  t==1)
                  System.out.println("INTERST IS :-"+(p*7.5*t)/100);
                else if( age<60 && t==2)
                    System.out.println("INTERST IS :-"+(p*8.5*t)/100);
                else if(age<60 && t==3)
                    System.out.println("INTERST IS :-"+(p*9.5*t)/100);
                else if(age<60 && t>3)
                    System.out.println("INTERST IS :-"+(p*10*t)/100);
                else System.out.println("BYE");
                if(  age>=60 &&t==1)
                    System.out.println("INTERST IS :-"+(p*8*t)/100);
                else if(age>=60 && t==2)
                    System.out.println("INTERST IS :-"+(p*9*t)/100);
                else if(age>=60 && t==3)
                    System.out.println("INTERST IS :-"+(p*10*t)/100);
                else if(age>=60 && t>3)
                    System.out.println("INTERST IS :-"+(p*11*t)/100);
                else System.out.println("BYE");




        }


    }

