package Patterrn_Printing.squares;
import java.util.Scanner;
//public class letterSquare {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter rows & cols: ");
//        int m = sc.nextInt();
//        for (int i = 1; i <=m; i++) {         // this loop represents rows
//            for (int j = 1; j <=m; j++) {       // this loop represents cols
//                System.out.print((char) (j+64) +" ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//Home Work - 1

//public class letterSquare {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter rows & cols: ");
//        int m = sc.nextInt();
//        for (int i = 1; i <=m; i++) {         // this loop represents rows
//            for (int j = 1; j <=m; j++) {       // this loop represents cols
//                System.out.print((char) (i+64) +" ");
//            }
//            System.out.println();
//        }
//
//    }
//}
//Home Work - 2
public class letterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {         // this loop represents rows
            for (int j = 1; j <=m; j++) {       // this loop represents cols
                System.out.print((char) (j+96) +" ");
            }
            System.out.println();
        }

    }
}