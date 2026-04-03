package Patterrn_Printing.Special_Patterns;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {         // this loop represents rows
            for (int j = 1; j <=i; j++) {
//                 if(i%2==1){
//                     if (j%2==1){
//                         System.out.print("1 ");
//                     }else {
//                         System.out.print("0 ");
//                     }
//
//                 }else {
//                     if (j%2==0) System.out.print("1 ");
//                     else System.out.print("0 ");
//                 }
                //OR 2nd Method
                if((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
