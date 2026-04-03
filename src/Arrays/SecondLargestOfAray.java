package Arrays;

public class SecondLargestOfAray {
    public static void main(String[] args) {

        int[] arr = {12, 23, 34, 45, 35, 98, 2, 8, -10, -90};
        int n = arr.length;
        int max = Integer.MIN_VALUE;  //this is the shortest value of integer

        for (int i = 1; i <n ; i++) {
//            if (arr[i]>max) max = arr[i];
            max = Math.max(max,arr[i]);
        }

        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            //if (arr[i]>smax && arr[i]!= max) smax = arr[i];  // ye bhi likh sakte hai
            if (arr[i]!= max)
            smax = Math.max(smax, arr[i]);
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
