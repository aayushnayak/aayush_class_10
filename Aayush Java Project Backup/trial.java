import java.util.Scanner;

public class trial {
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


            for (; denominator > 1; denominator--) {

                float den = (denominator * (denominator - 1));
                temp = 1 / den;
                sumOfInternalSeries = sumOfInternalSeries + temp;
            }
            float finalAnswer = numerator * sumOfInternalSeries;
            System.out.println("Final Answer = " + finalAnswer);



        }
    }
