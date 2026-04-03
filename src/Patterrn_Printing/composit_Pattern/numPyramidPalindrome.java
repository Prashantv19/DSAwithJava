package Patterrn_Printing.composit_Pattern;

import java.util.Scanner;

public class numPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) { //space +
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {  // + no. triangle +
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1 ; j--) { // + reverse loop chalega ulta side
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
// tree time loop chalega ek loop ke ander.