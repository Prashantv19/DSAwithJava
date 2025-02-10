package loops;

public class tableof19 {
    public static void main(String[] args) {
        //171 rounds
//        for (int i = 19; i <= 190; i++)
//            if (i % 19 == 0) System.out.println(i);
        //only 10 round so it is better then above
        for (int i = 19; i <= 190; i+=19)
            System.out.println(i);
    }
}
