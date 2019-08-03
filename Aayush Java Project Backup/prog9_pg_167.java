import java.util.*;
class V9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("The Series.");
        for(int i=10;i<=99;i++) {//checking condition
            int i_unit=i%10;//extracting units digit
            int i_ten=i/10;//extracting tens digit
            if(i_ten*2==i_unit) {
                System.out.println(i);//output
            }
        }
    }
}


