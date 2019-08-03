import java.util.*;
public class Array_Temperature_conversion {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TEMPERATURES YOU WANT TO STORE IN THE ARRAY :-");
        int l=sc.nextInt();
        int temp[]=new int[l];
        int i;
        double s=0;
        double con[]=new double[l];
        System.out.println("ENTER THE TEMPERATURE IN CELCIUS[INTEGER INPUT]");
        for(i=0;i<l;i++){
            temp[i]=sc.nextInt();
        }
        for(i=0;i<l;i++) {
            double f2c = (temp[i] * 9) / 5 + 32;
            con[i]=f2c;
        }
        System.out.println("THE TEMPERATURES CONVERTED TO CELCIUS ARE  :-");
        for(i=0;i<l;i++){
            System.out.println(con[i]+"  " );
        }

    }
}

