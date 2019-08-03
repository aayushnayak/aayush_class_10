import java.util.*;
public class Grade_10_project_2_array_grades {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STUDENTS WHOSE MARKS YOU WANT TO STORE :-");
        int l=sc.nextInt();
        int i;

        int sample;
        String names[]=new String[l];
        int roll[]=new int[l];
        int maths[]=new int[l];
        int science[]=new int[l];
        int english[]=new int[l];
        double average[]=new double[l];

        System.out.println("ENTER THE NAMES OF THE STUDENTS ONE BY ONE :-");
        for(i=0;i<l;i++){
            names[i]=sc.next();
        }

        System.out.println("ENTER THE ROLL NUMBERS OF THE STUDENTS ONE BY ONE :-");
        for(i=0;i<l;i++){
            roll[i]=sc.nextInt();
        }

        System.out.println("ENTER THE MARKS SCORED IN MATHS BY THE STUDENTS ONE BY ONE[OUT OF 100] :-");
        for(i=0;i<l;i++){
            maths[i]=sc.nextInt();
        }

        System.out.println("ENTER THE MARKS SCORED IN SCIENCE BY THE STUDENTS ONE BY ONE[OUT OF 100] :-");
        for(i=0;i<l;i++){
            science[i]=sc.nextInt();
        }

        System.out.println("ENTER THE MARKS SCORED IN ENGLISH BY THE STUDENTS ONE BY ONE[OUT OF 100] :-");
        for(i=0;i<l;i++){
            english[i]=sc.nextInt();
        }



        for(i=0;i<l;i++){
            System.out.println("THE NAME OF THE STUDENT IS :-  "+names[i]);
            System.out.println("THE ROLL NUMBER OF THE STUDENT IS :-  "+roll[i]);
            average[i]=(maths[i]+science[i]+english[i])/3;
            System.out.println("THE AVERAGE MARKS OF THE 3 SUBJECTS SCORED BY THE STUDENT IS :-  "+average[i]);
                if(average[i]>=85 && average[i]<=100)
                    System.out.println("THE REMARK FOR THE STUDENT IS #EXCELLENT#");
                else if(average[i]>=75 && average[i]<=84)
                    System.out.println("THE REMARK FOR THE STUDENT IS #DISTINCTION#");
                else if(average[i]>=60 && average[i]<=74)
                    System.out.println("THE REMARK FOR THE STUDENT IS #FIRST CLASS#");
                else if(average[i]>=40 && average[i]<=59)
                    System.out.println("THE REMARK FOR THE STUDENT IS #PASS#");
                else if(average[i]<40)
                    System.out.println("THE REMARK FOR THE STUDENT IS #POOR#");
                else System.out.println("SORRY");

            }

        }

    }

