import java.util.*;
public class Grade_10_project_7_array_national_park {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        String NatPark[] = {"Kanha", "Corbett", "Simlipal", "Nayzira", "Ponch", "Sirroi", "Periyar", "Indravati", "Namalaphu", "Kosi"};
        int tourist[] = {65, 78, 61, 40, 43, 47, 44, 58, 40, 27};
        System.out.println("THE NAME OF THE NATIONAL PARKS WITH THE NUMBER OF VISITORS :");
        for (i = 0; i < 10; i++) {
            System.out.println(NatPark[i] + "    " + (tourist[i] * 1000));
        }
        for(i=0;i<10;i++){
            int min = tourist[0];
            int max = tourist[0];
            int m=0;
            int mi=0;
            for (i = 0; i < 10; i++) {
                if (tourist[i] > max) {
                    max = tourist[i];
                    m=i;
                }
                else if (tourist[i] < min) {
                    min = tourist[i];
                    mi=i;
                }

            }
            System.out.println("The National Park with the most visitors is : " + NatPark[m]+" National Park ");
            System.out.println("The National Park with the least visitors is : " + NatPark[mi]+" National Park ");
        }
    }
}
