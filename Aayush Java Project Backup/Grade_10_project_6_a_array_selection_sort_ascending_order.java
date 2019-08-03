import java.util.*;
public class Grade_10_project_6_a_array_selection_sort_ascending_order {
    public static void main(String args[])
    {
        int size, i, j, temp;
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);


        size = 10;
        System.out.println("Enter Array Elements : ");
        for(i=0; i<size; i++)
        {
            arr[i] = scan.nextInt();
        }


        for(i=0; i<size; i++)
        {
            for(j=i+1; j<size; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order :");
        for(i=0; i<size; i++)
        {
            System.out.println(arr[i]+ "  ");
        }
    }
}
