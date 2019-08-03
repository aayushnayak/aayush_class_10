import java.util.*;
public class football
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR NAME");
        String n = sc.next();
        System.out .println("PLEASE ENTER YOUR AGE ");
        int age = sc.nextInt();
        System.out.println("NOW LETS TEST YOUR GENERAL KNOWLEDGE ABOUT FOOTBALL");
        System.out.println("PLEASE ENTER ALL YOUR ANSWERS IN CAPITAL :)");
        System.out.println("Q1) WHO IS THE YOUNGEST PLAYER WHO PLAYED IN FIFA 2018?");
        String a =sc.next();
        System.out.println("Q2) RECENTLY WHICH PLAYER MOVED FROM REAL MADRID TO JUVENTUS? ");
        String b =sc.next();
        System.out.println("Q3) WHICH TEAM WON THE FIFA 18 ?");
        String c =sc.next();
        System.out.println("Q4) NAME THE TEAM WHICH HAD PLAYED AGAINST THE WINNING TEAM IN THE FINALS OF FIFA 18?");
        String d =sc.next();
        System.out.println("Q5) WHICH TEAM HAS THE MAXIMUM WINS IN FIFA WORLD CUP?");
        String e =sc.next();
        System.out.println("Q6) WHO HAD GOT THE GOLDEN BOOT AWARD FOR FIFA 2014?");
        String f =sc.next();
        System.out.println("Q7) WHO HAD GOT THE BALLEN DOR AWRD  FOR FIFA 2014?");
        String g =sc.next();
        System.out.println("Q8) WHO IS THE CAPTAIN OF THE TEAM FRANCE?");
        String h =sc.next();
        System.out.println("Q9) WHO IS THE CAPTAIN OF THE TEAM ARGENTINA?");
        String i =sc.next();
        System.out.println("Q10) WHO IS THE CAPTAIN OF THE TEAM CROATIA?");
        String j=sc.next();
        String aa="MBAPPE";
        String ab="RONALDO" ;
        String ac="FRANCE" ;
        String ad="CROATIA"  ;
        String ae="BRAZIL" ; 
        String af="RODRIGUEZ" ;
        String ag="RONALDO" ;
        String ah="LLORIS" ;
        String ai="MESSI" ;
        String aj="MODRIC" ;
          System.out.println(" YOUR SCORESHEET : -   ");

       { if(a==aa )
            System.out.println(" Q1) IT IS THE CORRECT ANSWER");
        else if(a!=aa)
            System.out.println("Q1) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +aa);
        }
        { if(b==ab)
            System.out.println("Q2) IT IS THE CORRECT ANSWER");
        else if(b!=ab)
            System.out.println("Q2) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +ab );
        }
         {if(c==ac)
            System.out.println("Q3) IT IS THE CORRECT ANSWER");
        else if(c!=ac)
            System.out.println("Q3) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +ac );
        }
        {
         if(d==ad)
            System.out.println("Q4) IT IS THE CORRECT ANSWER");
        else if(d!=ad)
            System.out.println("Q4) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +ad );
        }
        {
         if(e==ae)
            System.out.println("Q5) IT IS THE CORRECT ANSWER");
        else if(e!=ae)
            System.out.println("Q5) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +ae );
        }
        {
         if (f==af)
            System.out.println("Q6) IT IS THE CORRECT ANSWER");
        else if(f!=af)
            System.out.println("Q6) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +af);
        }
        {
        if(g==ag)
            System.out.println("Q7) IT IS THE CORRECT ANSWER");
        else if(g!=ag)
            System.out.println("Q7) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +ag );
        }
        {
        if(h==ah)
            System.out.println("Q8) IT IS THE CORRECT ANSWER");
        else if(h!=ah)
            System.out.println("Q8) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +ah );
        }
        {
         if(i==ai)
            System.out.println("Q9) IT IS THE CORRECT ANSWER");
       else  if(i!=ai)
            System.out.println("Q9) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +ai );
        }
        {
         if(j==aj)
            System.out.println("Q10) IT IS THE CORRECT ANSWER");
        else if(j!=aj)
            System.out.println("Q10) IT IS THE INCORRECT ANSWER  "+ "THE CORRECT ANSWER IS :-  " +aj);
        }
    }
}