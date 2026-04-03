package Arrays;

import java.util.Scanner;

public class outputOfarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array: ");

        int n = sc.nextInt();    // we can use this for n no. of elements as input

        int[] arr = new int[n];     // first declearation is imortant

        for (int i = 0; i <=5 ; i++) {     // input using loops
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i <= 5; i++) {        // output using loops
            System.out.print(arr[i] + " ");
        }
    }
}
