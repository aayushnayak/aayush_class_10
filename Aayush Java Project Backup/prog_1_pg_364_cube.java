import java.util.*;
public class prog_1_pg_364_cube {
    int cub;
    void cube(int n){
        cub=n*n*n;
        System.out.println("THE CUBE OF THE NUMBER IS : "+ cub);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        prog_1_pg_364_cube obj=new prog_1_pg_364_cube();
        System.out.println("THIS PROGRAM WILL ASK YOU FOR 10 INPUTS OF NUMBERS ON BY ONE");
        for(int i=1;i<=10;i++) {
            System.out.println("ENTER A NUMBER ");
            int input = sc.nextInt();
            obj.cube(input);
        }
    }
}
