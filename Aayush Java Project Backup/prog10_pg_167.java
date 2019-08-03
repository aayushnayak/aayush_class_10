import java.util.*;//did not understand the logic
public class prog10_pg_167 {


        public static void main(String args[]) {
            Scanner in =  new Scanner(System.in);
            System.out.println("Enter a Number:");
            int i_input = in.nextInt();
            int i_reverse=0,f=0;//not understanding what variable f is doing
            //Checking Prime
            for(int i=1;i<=i_input;i++) {
                if(i_input%i==0) {
                    f++;
                }
            }
            if(f==2) {
                f=0;
                while(i_input!=0) {
                    int digit=i_input%10;
                    i_reverse=i_reverse*10+digit;
                    i_input=i_input/10;
                }//finding Reverse
                for(int i=1;i<=i_reverse;i++) {
                    if(i_reverse%i==0) {
                        f++;
                    }
                }
                if(f==2) {
                    System.out.println("It is a Twisted Prime Number.");
                }
                else {
                    System.out.println("It is not a Twisted Prime Number.");
                }//inner if
            }
            else {
                System.out.println("It is not a Twisted Prime Number.");
            }//outer if
        }//main
    }//class

