import java.util.*;
public class switchcasewithscanner
{
public static void main  (String [] args)
{
    Scanner sc = new Scanner(System.in);
    double num1,num2;
    System.out.println("Enter the first number  ");
    num1 = sc.nextDouble();
    System.out.println("Enter  the second number ");
    num2 = sc.nextDouble();
    System.out.println("Choose the operators from (+ , - , * , / , %)");
  
     char operator = sc.next().charAt(0);
    double result ; 
    switch(operator)
    {
        case '+':
        result = num1 + num2;
        break;
     case '-':
        result = num1 -num2;
        break;
         case '*':
        result = num1 * num2;
        break;
         case '/':
        result = num1 / num2;
        break;
         
          case '%':
        result = num1 % num2;
        break;
        default:
        System.out.println("The operator entered is invalid ");
        return;
    }
    System.out.println("The output of the operator " + operator + " is " +  result);
}
}