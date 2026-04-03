package Patterrn_Printing.composit_Pattern;
import java.util.Scanner;
public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        for (int i = 1; i <=2*n-1 ; i++) { // first line
            System.out.print("*"+ " ");
        }
        System.out.println();
        n--;
        for (int i =1; i <=n ; i++) {  //rows
            for (int j = 1; j <=n+1-i ; j++) { // column
                System.out.print("*"+ " ");
            }
            for (int j = 1; j <=2*i-1; j++) {  // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <=n+1-i ; j++) {  // column
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
