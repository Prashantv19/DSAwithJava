package Patterrn_Printing.composit_Pattern;
import java.util.Scanner;
public class starPyramidMeth2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        int nsp = n-1;  // no. of spaces at first time
        int nst = 1;  // no. of stars at first time
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("*"+ " ");

            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
//this method is only space and stars are printing