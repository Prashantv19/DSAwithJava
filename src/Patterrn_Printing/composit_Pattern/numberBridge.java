package Patterrn_Printing.composit_Pattern;
import java.util.Scanner;
public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        for (int i = 1; i <=2*n-1 ; i++) { // first line
            System.out.print(i+ " ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <=n ; i++) {
            int a=1; // extra variable
            for (int j = 1; j <=n+1-i ; j++) { //num(a) print hoga aur 1 se bad jayega
                System.out.print(a+" ");
                a++;
            }
            for (int j = 1; j <=2*i-1 ; j++) { //space print hoga aur (a) 1 se bad jayega
                System.out.print("  ");         //important*
                a++;
            }
            for (int j = 1; j <=n+1-i ; j++) { //num(a) print hoga aur 1 se bad jayega
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
