import java.util.*;
public class prog_6_pg_350_elctric_bill_function {
double elec(int u){
    double c=0.0D;
    if(u<=100)
        c=(u*1.25);
    if((u>100)&&(u<=200))
        c=((100*1.25)+(u-100)*1.50);
    if(u>200)
        c=((100*1.25)+(100*1.50)+(u-200)*1.80);
    return c;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER CONSUMER'S NAME ");
    String name=sc.next();
    System.out.println("ENTER CONSUMER NUMBER ");
    int cn=sc.nextInt();
    System.out.println("ENTER PREVIOUS READING ");
    int prev=sc.nextInt();
    System.out.println("ENTER PRESENT READING ");
    int pres=sc.nextInt();
    int un=pres-prev;
    prog_6_pg_350_elctric_bill_function ob=new prog_6_pg_350_elctric_bill_function();
    double amt=ob.elec(un);
    System.out.println("ConsumerNo.\tName\tUnit Consumed\tAmount");
    System.out.println(cn+"\t\t"+name+"\t\t"+un+"\t\t"+amt);


}
}
