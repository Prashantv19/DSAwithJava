package Arrays;

import java.util.ArrayList;

public class arrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println(list+" "+list.size()); //[] 0

        list.add(60);
        System.out.println(list+" "+list.size()); //[60] 1
        list.add(40);
        System.out.println(list+" "+list.size()); //[60, 40] 2
        list.add(120);
        System.out.println(list+" "+list.size()); //[60, 40, 120] 3
        list.add(140);
        System.out.println(list+" "+list.size()); //[60, 40, 120, 140] 4

        list.remove(1);
        System.out.println(list+" "+list.size()); //[60, 120, 140] 3

    }
}
/*
1. hamne capacity declear nahi ki hai toh direct index ke through insert nhi kar sakte hai.
2. hum bich me se bhi element ko remove kar sakte hai.
3. value ko pichhe se insert karte hai.
4. array list ko hum increase kar sakte hai.
5. 

*/