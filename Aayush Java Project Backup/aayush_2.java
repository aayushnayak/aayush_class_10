import java.util.Scanner;

public class aayush_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int d,s=0;
        int p=n*n;
        do{{d=p%10;
            s=s+d;
            p=p/10;
        }}while(p!=0);
            if(s==n)
        System.out.println("neon");
            else
                System.out.println  ("not neon");
    }}


