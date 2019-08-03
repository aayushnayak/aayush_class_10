import  java.util.*;
public class aayush_5 {


        public static void main(String []args){
            Scanner sc= new Scanner (System.in);
            System.out.println("enter a number" );
            int n= sc.nextInt();
            int num=n;

            int f=0;
            int p=num*num;
            do
            {
                if(num%10!=p%10)//if
                {
                    f = 1;
                    break;
                }

                else
                {
                    num /= 10;
                    p /= 10;
                }
            }
            while(num!=0);//

            if (f==0)
            System.out.println("automorphic");
            else
                System.out.println("not automorpfic");
        }
    }


