package Patterrn_Printing.Special_Patterns;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        int a=1;
        for (int i = 1; i <=m; i++) {         // this loop represents rows
            for (int j = 1; j <=i; j++) {       // this loop represents cols
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
