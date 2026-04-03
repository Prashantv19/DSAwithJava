package Arrays;

public class maximumOfArray {
    public static void main(String[] args) {

//        //Methhod-1
//        int[] arr = {12, 23, 34, 45, 35, 98, 2, 8, 10, 90};
//        int n = arr.length;
//        int max = arr[0];
//        for (int i = 1; i <n ; i++) {
//            if (arr[i]>max) max = arr[i];
//        }
//        System.out.println(max);

        //Method-2 (this is very generic method)
        int[] arr = {12, 23, 34, 45, 35, 98, 2, 8, -10, -90};
        int n = arr.length;
        int max = Integer.MIN_VALUE;  //this is the shortest value of integer
        for (int i = 1; i <n ; i++) {
//            if (arr[i]>max) max = arr[i];
            max = Math.max(max,arr[i]);   // here it compares both max and arr[i] and then put it into max variable
        }
        System.out.println(max);
    }
}
