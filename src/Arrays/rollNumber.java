package Arrays;
public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {19, 39, 45,56,34,25,12};
        int n = arr.length;   // hum length ko count karenge
        System.out.print("Roll Number : ");
        for (int i = 0; i < n; i++) {
            if (arr[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
