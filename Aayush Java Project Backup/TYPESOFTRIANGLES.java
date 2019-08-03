import java.util.*;
public class TYPESOFTRIANGLES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST SIDE OF THE TRIANGLE");
        int s1 = sc.nextInt();
        System.out.println("ENTER THE SECOND SIDE OF THE TRIANGLE");
        int s2 = sc.nextInt();
        System.out.println("ENTER THE THIRD SIDE OF THE TRIANGLE");
        int s3 = sc.nextInt();
        if (s1 == s2 && s2 == s3 && s3 == s1)
            System.out.println("THE TRIANGLE IS EQUILATERAL");
        else if ((s1 == s3) || (s2 == s3) || (s1 == s2))
            System.out.println("THE TRIANGLE IS ISOSCELES");
        else
            System.out.println("THE TRIANGLE IS SCALENE");
    }
}




