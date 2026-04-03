package Patterrn_Printing.triangles;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {         // this loop represents rows
            for (int j = 1; j <=i; j++) {       // this loop represents cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//HOME WORK-1

//public class triangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter rows & cols: ");
//        int m = sc.nextInt();
//        for (int i = 1; i <=m; i++) {         // this loop represents rows
//            for (int j = 1; j <=i; j++) {       // this loop represents cols
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//Home Work - 2
//public class triangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter rows & cols: ");
//        int m = sc.nextInt();
//        for (int i = 1; i <=m; i++) {         // this loop represents rows
//            for (int j = 1; j <=i; j++) {       // this loop represents cols
//                System.out.print((i)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
