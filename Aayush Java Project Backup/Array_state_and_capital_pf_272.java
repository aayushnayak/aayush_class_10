import java.util.*;
public class Array_state_and_capital_pf_272 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int i;
    String f;
        System.out.println("ENTER THE NUMBER OF STATES AND CAPITALS YOU WANT TO STORE :-");
    int l=sc.nextInt();
    String states[] = new String[l];
    String capitals[]=new String[l];
    int j;

        for(i=0;i<l;i++){
        System.out.println("ENTER THE NAME OF THE STATE :-");
        states[i]=sc.next();
        System.out.println("ENTER THE NAME OF THE CAPITAL :-");
        capitals[i]=sc.next();

    }

        System.out.println("ENTER THE NAME OF THE STATE WHOSE CAPITAL IS TO BE SEARCHED  :-");
    String s=sc.next();
    int present=0;

        for(i=0;i<l;i++){
        f=states[i];
        if(f.equals(s)) {
            present=1;
            break;
        }
        else
            present=0;
    }
        if(present==1)
            System.out.println("THE NAME OF THE STATE IS "+states[i]+" AND ITS CAPITAL IS "+capitals[i]);
        else
                System.out.println("STATE NOT FOUND");



}
}





