package Arrays;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        //Shallow Copy/copy of array
        int[] arr = {90, 80, 30, 40, 50, 60};

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int[] nums = arr;  //Shallow copy- that means ye achhe se copy nahi huaa hai.
        //nums[0] = 70; //this changes happens in both "nums and arr"
        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();


        //Deep Copy of an Array-Method 1
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] =70;
        System.out.println(brr[0]);   //new array
        System.out.println(arr[0]);  // no changes happened in original array

        //Deep Copy of an Array-Method 2

        int[] crr = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            crr[i] = arr[i];
        }
        crr[0] = 100;
        System.out.println(arr[0]);
    }
}
