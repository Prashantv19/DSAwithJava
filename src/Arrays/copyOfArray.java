package Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {90, 80, 30, 40, 50, 60};

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int[] nums = arr;  //Shallow copy- that means ye achhe se copy nahi huaa hai.

        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i]+" ");

        }
    }
}
