package Patterrn_Printing.triangles;

import java.util.Scanner;

//public class numberTriangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter rows & cols: ");
//        int m = sc.nextInt();
//        for (int i = 1; i <=m; i++) {         // this loop represents rows
//            for (int j = 1; j <=i; j++) {       // this loop represents cols
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//Type-2
public class numberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {         // this loop represents rows
            for (int j = 1; j <=i; j++) {       // this loop represents cols
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
