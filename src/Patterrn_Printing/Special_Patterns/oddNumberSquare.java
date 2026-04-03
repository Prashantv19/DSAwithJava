package Patterrn_Printing.Special_Patterns;

import java.util.Scanner;

public class oddNumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }

    }
}
