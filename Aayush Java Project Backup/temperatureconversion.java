import java.util.*;
public class temperatureconversion {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String C="CONVERT CELSIUS TO FARENEHIET";
        String F="CONVERT FARENEHIET TO CELCIUS";
        String E="EXIT";
        System.out.println("PLEASE ENTER THE TEMPERATURE [EITHER IN CELCIUS OR IN FARENHEIT] - ");
        int  temp = sc.nextInt();
        System.out.println("CHOOSE FROM THE FOLLOWING OPERATIONS :- 1-CONVERT CELSIUS TO FARENEHIET(C)|2-CONVERT FARENEHIET TO CELCIUS(F)|3- EXIT(E)");
        char cat = sc.next().charAt(0);
        double f2c=(temp*9)/5+32;
        double c2f=(temp-32)*5/9;
        switch(cat)
        {
            case 'C':
                System.out.println("TEMPERATURE IN FARENHEIT IS :- "+c2f);
                break;
            case 'F':
                System.out.println("TEMPERATURE IN CELCIUS IS :- "+f2c);
                break;
            case 'E':
                System.out.println("ARE YOU SURE YOU WANT TO EXIT ?");
                break;
            default:
                System.out.println("SOMETHING WENT WRONG , PLEASE TRY AGAIN :)");
                return;
        }
    }
}
