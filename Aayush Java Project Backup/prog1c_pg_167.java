public class prog1c_pg_167 {
    public static void main(String args[])
    {
        int i;
        int a=0,b=1,c=2,d;
        System.out.print(a+" "+b+" "+c);
        for(i=1;i<=10;i++)
        {
            d=a+b+c;
            System.out.print(" "+d);
            a=b;
            b=c;
            c=d;
        }


    }
}
