import java.util. *;
public class watertaxusingscanner
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        double water,tax= 0;
        System.out.println("ENTER WATER CONSUMED IN GALLONS");
        water=sc.nextDouble();
        if(water>475 && water<=75)
        tax=475;
        else if(water > 75 && water<=125)
        tax = 750;
        else if (water > 125 && water <= 200)
        tax = 1225;
        else if (water >200 && water <= 350)
        tax = 1650;
        else if(water>350)
        tax = 2000;
        System.out.println("THE WATER TAX TO BE PAID IS  = " + tax);
    }
}
        
    


