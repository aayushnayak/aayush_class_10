import java.util.Scanner;

public class aayush_6 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter a number");
        int n=sc.nextInt();
        int num=n;
        int a;
        int sum=0;//
        while(n!=0)
        {
            a=n%10;
            sum=sum+a*a*a;
            n=n/10;
        }
        if(sum==num)
      System.out.println  ("Armstrong");
                else
                     System.out.println  ("not armstrong");
    }

}
