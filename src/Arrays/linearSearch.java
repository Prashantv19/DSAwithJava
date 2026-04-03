package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target Element : ");
        int x = sc.nextInt();
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];      // declearation of array
        System.out.print("Enter Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 1st way... but this is not perfect way
//        for (int i = 0; i < n ;i++){
//            if(arr[i]==x){
//                System.out.println("Element Found");
//            }
//        }
        //2nd way
        boolean flag = false;          // False means Not Found
        for (int i = 0; i < n ;i++) {
            if (arr[i] == x) {
                flag = true;           // true means found , ye usko ture kar dega
                break;
            }
        }
        if(flag == true) System.out.println("Element Found");
        else System.out.println("Element Not Found");
    }
}