import java.util.Scanner;
 class Digit_Sum
{
    public static void main(String args[])
    {
        int i, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        i = s.nextInt();
        while(i > 0)
        {
            n = i % 10;//i divided by ten [remainder]
            sum = sum + n;
            i = i / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
