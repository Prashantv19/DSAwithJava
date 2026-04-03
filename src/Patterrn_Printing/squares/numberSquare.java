package Patterrn_Printing.squares;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {         // this loop represents rows
            for (int j = 1; j <=m; j++) {       // this loop represents cols
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
//Another type of no square or Rotated number Square
//public class numberSquare {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter rows & cols: ");
//        int m = sc.nextInt();
//        for (int i = 1; i <=m; i++) {         // this loop represents rows
//            for (int j = 1; j <=m; j++) {       // this loop represents cols
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}
