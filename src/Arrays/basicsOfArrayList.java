package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,29); //initialize
        arr.add(1,34);
        arr.add(2,23);
        arr.add(3,45);
        arr.add(4,56);
        arr.add(5,67);

        System.out.println(arr); //O/P- [29, 34, 23, 45, 56, 67], for printing whole array list.
        for (int i = 0; i <= 5; i++) {
            System.out.print(arr.get(i)+" ");  //for printing individual element of array list.
        }

        System.out.println();

        System.out.println(arr.get(0));  //29
        System.out.println(arr.get(1));  //34

        System.out.println();

        arr.set(2,300);  //modify
        System.out.println(arr);   //29 34 300 45 56 67

        arr.add(600);  //push back
        System.out.println(arr);

        System.out.println(arr.size());  //check size of an array list


    }
}
