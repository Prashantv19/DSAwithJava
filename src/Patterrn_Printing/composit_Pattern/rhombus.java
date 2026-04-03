package Patterrn_Printing.composit_Pattern;
import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {  // rows
            for (int j = 1; j <=n-i ; j++) {  //  pahle spaces (flipped triangle) print hoga, loop 1 to n-i tak chalega.
                System.out.print("  ");
            }
            for (int j = 1; j <=n ; j++) {   // then star square print hoga, toh finally rhombus shape find hoga.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
