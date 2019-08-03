import java.util.*;
public class Grade_10_project_3_array_year_of_graduation {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("THE RECORD OF YEARS IS :- ");
        System.out.println("1982,1987,1993,1996,2003,2006,2007,2009,2010");
        System.out.println("ENTER THE YEAR OF YOUR GRADUATION :-");
        int y=sc.nextInt();

        int year[]={1982,1987,1993,1996,2003,2006,2007,2009,2010};
        int l=year.length;
        int low=0;
        int high=l-1;
        int counter=0;
        int mid=0;
        while(low<=high) {
            mid = (low + high) / 2;
            if (year[mid] == y) {
                counter++;
                break;
            }
            if (year[mid] < y) {
                low = mid + 1;
            }
            if (year[mid] >y) {
                high = mid - 1;
            }
        }
        if(counter>0)
            System.out.println("RECORD EXISTS :)");
            else
            System.out.println("RECORD DOES NOT EXISTS :(");

    }
}
