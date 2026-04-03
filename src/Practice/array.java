package Practice;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of element: ");
        int n = sc.nextInt();      // taking input of size of array
        int[] arr = new int[n];    // declearation of array
        System.out.println("enter the elements: ");
        for (int i = 0; i <=n-1 ; i++) {
            arr[i] = sc.nextInt();        // initialisation of array
        }
        for (int i = 0; i <=n-1 ; i++) {
            System.out.print(arr[i]+ " ");  // printing of an array

        }
//        System.out.println();
//        int n1 = arr.length;
//        System.out.println(n1);
//        System.out.println(arr.length);
//        System.out.println(arr[2]);
    }
}
