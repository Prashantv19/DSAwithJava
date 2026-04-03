package Arrays;

import java.util.Arrays;

public class arrayListBuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {90, 80, 30, 40, 50, 60};

        for (int ele : arr) {     //we read it like "for int element in Array"
            System.out.print(ele + " ");  //Printing Array using For-Each loop
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");    //Printing Array using For loop
//        }

        Arrays.sort(arr);   //sorting an array
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
