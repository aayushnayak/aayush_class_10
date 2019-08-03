import java.util.*;
public class prog17_pg154 {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,n,k=1;
        System.out.println("ENTER THE FIRST NUMBER");
        n=in.nextInt();
        System.out.println("50 PRIME NUMBERS FRROM"+ n +":");
        do {
            {
                c=0;
                        for(a=1;a<=n;a++)
                        {
                            if(n%a==0)
                                c=c+1;

                        }
                        if(c==2) {
                            System.out.println(n + " ");
                            k = k + 1;
                        }
                        n=n+1;
                        }
            }while(k<=50);
        }


    }


