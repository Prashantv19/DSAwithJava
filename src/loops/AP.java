package loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

//        for (int i = 1; i <=2*n-1; i+=2)
//            System.out.println(i);
        //n round

        // METHOD 2
        // 4 7 10 13 16....n
        int a = 4, d = 3;
        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            a += d;

        }
    }
}
