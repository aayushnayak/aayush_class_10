import java.util.*;
public class prog20_pg157 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n,ch,c,i,min,r;
        System.out.println("1. TO CHECK A COMPOSITE NUMBER");
        System.out.println("2.TO FIND THE SMALLEST DIGIT OF AN INTEGER");
        System.out.println("ENTER YOUR CHOICE!");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS COMPOSITE OR NOT.");
                n=in.nextInt();
                c=0;
                        for(i=2;i<n;i++)
                            if(n%i==0)
                                c=c+1;
                            if(c>=1)
                                System.out.println("IT IS A COMPOSITE NUMBER.");
                            else
                                System.out.println("IT IS NOT A COMPOSITE NUMBER.");
                            break;

            case 2 :
                System.out.println("ENTER ANUMBER TO FIND THE SMALLEST DIGIT");
                n=in.nextInt();
                min=n%10;
                while(n>0)
                {
                    r=n%10;
                    if(r<min)
                        min=r;
                    n=n/10;
                }
                        System.out.println("THE SMALLEST DIGIT IS :\t"+min);
                break;
            default :
                System.out.println("INVALID CHOICE");
        }
    }
}
