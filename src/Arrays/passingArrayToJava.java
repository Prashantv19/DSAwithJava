package Arrays;

public class passingArrayToJava {
    public static void main(String[] args) {
//        int x = 5;  //using normal variable
        int[] arr = {10,20,30,40};  // using Array
        System.out.println(arr[0]);
//        change(x);  // function for variable345
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] x) {
        x[0]= 90;
    }
}
