import java.util.*;
public class prog_10_pg_354_num_cal_function {
    Scanner sc=new Scanner(System.in);
    void num_cal(int num,char ch){
        if(ch=='s')
            System.out.println("THE SQUARE OF THE NUMBER IS = " +num*num);
        else
            System.out.println("THE CUBE OF THE NUMBER IS = "+ num*num*num);
    }
    void num_cal(int a,int b,char ch){
        if(ch=='p')
            System.out.println("THE PRODUCT OD THE NUMBERS IS =" + a*b);
        else
            System.out.println("THE SUM OF THE NUMBERS IS = "+ a+b);
    }
    void num_cal(String str1,String str2){
        if(str1.equals(str2))
            System.out.println("THE ENTERED STRINGS ARE EQUAL  ");
        else
            System.out.println("THE ENTERED STRINGS ARE NOT EQUAL");
    }
    public static void main(String args[]){
        prog_10_pg_354_num_cal_function obj=new prog_10_pg_354_num_cal_function();
        obj.num_cal(3,'s');
        obj.num_cal(3,5,'p');
        obj.num_cal("aayush","yash");
        

    }
}
