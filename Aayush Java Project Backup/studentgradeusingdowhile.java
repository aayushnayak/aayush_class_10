import java.util.*;
public class studentgradeusingdowhile
{
    public static void main(String[]args)
    {
        int maths,physics,chemistry,english,computer;
        double finalscore;
        boolean result;
        Scanner marks = new Scanner(System.in);
        
        do
        {
            System.out.println("Enter Marks for Maths");
            maths= marks.nextInt();
            System.out.println("Enter Marks for Chemistry");
            chemistry= marks.nextInt();
            System.out.println("Enter Marks for Physics");
            physics= marks.nextInt();
            System.out.println("Enter Marks for English");
            english= marks.nextInt();
            System.out.println("Enter Marks for Computer");
           computer= marks.nextInt();
           finalscore = (maths+english+chemistry+physics+computer)/5;
           
           
           if (finalscore>90)
           {
               System.out.println("EXCELLENT");
            }
            else if (finalscore>80)
            {
                System.out.println("VERY GOOD");
            }
             else if (finalscore>60)
            {
                System.out.println(" GOOD");
            }
             else if (finalscore>40)
            {
                System.out.println("AVERAGE");
            }
           else 
           {
               System.out.println("POOR");
            }
            System.out.println("ANY MORE STUDENTS");
            
            result = marks.nextBoolean();
        }while (result);
        
    }
}
    

            