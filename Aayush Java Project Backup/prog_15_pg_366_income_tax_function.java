import java.util.*;
public class prog_15_pg_366_income_tax_function {
    String name;
    int income;
    int tax;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        name=sc.nextLine();
        System.out.println("ENTER YOUR ANNUAL INCOME");
        income=sc.nextInt();
    }
    void calculation(){
        if(income<=50000){
            tax=0;
        System.out.println("THE INCOME TAX IS = " +tax);}
       else if(income>50000 && income <=100000){
            tax=(10/100)*(income-50000);
            System.out.println("THE INCOME TAX IS = " +tax);}
        else if(income>100000 && income <=150000){
            tax=(20/100)*(income-100000)+5000;
            System.out.println("THE INCOME TAX IS = " +tax);}
        else if(income>150000 ){
            tax=(30/100)*(income-150000)+15000;
            System.out.println("THE INCOME TAX IS = " +tax);}
    }
    public static void main(String args[]){
        prog_15_pg_366_income_tax_function obj=new prog_15_pg_366_income_tax_function();
        obj.input();
        obj.calculation();


    }
}
