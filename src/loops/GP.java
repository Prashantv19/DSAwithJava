package loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = in.nextInt();

        int a=1;
        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            a*=2;

        }
    }
}
