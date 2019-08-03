import java.util.Scanner;

public class displaytotalmarksandaveragePAGENUMBER_81
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks for physics");
        int phy=sc.nextInt();
        System.out.println("enter the marks for chemistry");
        int chem=sc.nextInt();
        System.out.println("enter the marks for biology");
        int bio=sc.nextInt();

        int sum;
        float avg = 0.0F;
        sum= (phy+chem+bio);
        avg=sum/3;
        System.out.println("THE TOTAL MARKS = "+ sum);
        System.out.println("THE AVERAGE MARKS = "+avg);
    }
}
 