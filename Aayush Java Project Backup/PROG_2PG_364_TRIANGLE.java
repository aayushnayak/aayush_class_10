import java.util.Scanner;

public class PROG_2PG_364_TRIANGLE {
    void triangle(int s1, int s2, int s3) {
        if (s1 == s2 && s2 == s3 && s3 == s1)
            System.out.println("THE TRIANGLE IS EQUILATERAL");
        else if ((s1 == s3) || (s2 == s3) || (s1 == s2))
            System.out.println("THE TRIANGLE IS ISOSCELES");
        else
            System.out.println("THE TRIANGLE IS SCALENE");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST SIDE OF THE TRIANGLE");
        int x = sc.nextInt();
        System.out.println("ENTER THE SECOND SIDE OF THE TRIANGLE");
        int y = sc.nextInt();
        System.out.println("ENTER THE THIRD SIDE OF THE TRIANGLE");
        int z = sc.nextInt();
        PROG_2PG_364_TRIANGLE obj= new PROG_2PG_364_TRIANGLE();
        obj.triangle(x,y,z);
    }
}
