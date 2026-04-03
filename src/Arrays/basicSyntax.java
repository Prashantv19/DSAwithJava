package Arrays;

public class basicSyntax {
    public static void main(String[] args) {

        int[] arr = new int[5]; // declearation
        //or actually like this
//        int[] arr;    // declearation
//        arr = new int[6]; // memory allocation
        // initializing individual element
        arr[0]= 10;
        arr[1]= 20;
        arr[2]= 30;
        arr[3]= 40;
        arr[4]= 50;
        System.out.print(arr[0]+" "); // before
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.println(arr[4]+" ");

        arr[0] = 99;   // updation
        arr[0]+=10;
        arr[2]-=10;
        System.out.print(arr[0] + " ");   // after updation
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");



    }
}
