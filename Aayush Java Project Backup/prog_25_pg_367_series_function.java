import java.util.*;
public class prog_25_pg_367_series_function {
    double s = 0;

    double series(double n) {
        int i;
        for (i = 1; i <= n; i++) {
            s = s + 1.0 / i;


        }
        System.out.println("THE SUM OF THE SERIES OF THE FIRST FUNCTION IS :  " +s);
        return (s);
    }
    

    double series(double a, double n) {
        int i,c=1;
        for(i=1;i<=n;i++){
            s=s+c/Math.pow(a,c+1);
            c+=3;

        }
        System.out.println("THE SUM OF THE SERIES OF THE SECOND FUNCTION IS :  " +s);
        return(s);

    }

    public static void main(String[] args){
        prog_25_pg_367_series_function obj= new prog_25_pg_367_series_function();
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER 1] IF YOU WANT TO TO RUN THE FIRST FUNCTION.");
        System.out.println("ENTER 2] IF YOU WANT TO TO RUN THE SECOND FUNCTION.");
        int choice =sc.nextInt();
        switch(choice){
            case 1 :
                System.out.println(" ENTER THE VALUE FOR n TO PROCEED WITH RUNNING THE FUNCTION");
                 double dn=sc.nextDouble();
                obj.series(dn);

                break;
            case 2:
                System.out.println("ENTER THE VALUE OF a AND n TO PROCEED WITH RUNNING THE FUNCTION");
                double da=sc.nextDouble();
                double dan=sc.nextDouble();
                obj.series(da,dan);
                break;
            default:
                System.out.println("TRY AGAIN SOMETHING WENT WRONG");
                return;
        }


    }
}



