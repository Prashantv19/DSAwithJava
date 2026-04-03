package Arrays;

public class multiplyOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11};

        int mul = 1;  //ek variable banayenge jaha array store hoga
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        System.out.println(mul);
    }
}
