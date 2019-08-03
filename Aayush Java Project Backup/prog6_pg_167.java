import java.util.*;
class V6 {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a No.:");
    int n = in.nextInt();//TAKING THE INPUT
    int a=0 ;//Ans: You are declaring a variable 'a' with initial value as 0.
    // The variable 'a' will store the final output which you are printing at the
    // final step using below line(System.out.println("After Removing Zeros:\n"+a);)
    int c=0;//Ans: C is the variable whose value is increasing after each iteration.
    while(n!=0) {//While the number is not equal to zero.
        int d=n%10; //modulus operator gives remainder on dividing the first operand with second.
        //So d=n%10 means store the remainder of n/10 in the variable d.
        n=n/10; //After that divide the number n by 10 and store the new value in the same variable n.
        if(d==0)//If the remainder of n%10 i.e. d is equal to 0 then it will enter the if condition.
        {
            continue;// continue causes the loop to immediately jump to the next iteration of the loop.
            //It will go directly to while(n!=0) loop.
        }
        else
        {
            a=a+d*(int)Math.pow(10,c);// Math.pow(10,c) returns the value of the first argument
            // i.e. 10 raised to the power of the second argument i.e.
            // c(Initial value of c is 0).

            c++;// Increase the value of c by 1.
        }
    }
    System.out.println("The new no.= "+a); //Print the value of a which is the required output.
}
}