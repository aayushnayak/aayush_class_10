import java.util.*;
public class prog_17b_pg_168 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numerator;
        int denominator;
        float temp;//float is to get the answer in decimal
        float sumOfInternalSeries = 1;

        System.out.println("Enter numerator: ");//to take user input
        numerator = sc.nextInt();//this is to store the input
        System.out.println("Numerator = " + numerator);//printing the above input
        System.out.println("Enter denominator: ");//to take user input
        denominator = sc.nextInt();//this is to store the input
        System.out.println("Denominator = " + denominator);//printing the above input


        for (; denominator > 1; denominator--) {//decreamenting the value of the denominator by 1

            float den = (denominator * (denominator - 1));//calculating the denominator
            temp = 1 / den;
            sumOfInternalSeries = sumOfInternalSeries + temp;//finding the sum
        }
        float finalAnswer = numerator * sumOfInternalSeries;//finding the value for the final answer
        System.out.println("Final Answer = " + finalAnswer);//showing the output or printing the output


    }
}
