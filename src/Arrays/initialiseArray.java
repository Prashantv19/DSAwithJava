package Arrays;

public class initialiseArray {
    public static void main(String[] args) {

        int[] arr= {10,20,30,40,50};   // directly initialisation of array

        int n= arr.length;

        System.out.println(n);

        System.out.println(arr.length);

        System.out.println(arr[2]);

        for (int i = 0; i <n ; i++) {   // 0 se 4 tak loop chalega total 5 elements
            System.out.print(arr[i]+" ");
        }
    }
}
