package conditional;

import java.util.Scanner;

public class leastofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a<=b && a<=c) System.out.println(a+"is least");
        else if (b<=a && b<=c) System.out.println(b+" is least");
        else System.out.println(c+"is least");
    }
}
