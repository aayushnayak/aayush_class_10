import java.util.Scanner;

public class aayush_3 {


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        int num=n;
        int sum=0;

        while(num!=0)//
        {
            int f=1;
            int d=num%10;
            for(int i=1;i<=d;i++)
            {
                f*=i;
            }
            sum+=f;
            num/=10;
        }

        if(sum==n)//
        System.out.println("special");
        else
        System.out.println("not special");
    }}



