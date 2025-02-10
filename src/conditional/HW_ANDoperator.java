package conditional;

import java.util.Scanner;

public class HW_ANDoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n > 9999 && n < 100000) {
            System.out.println("5 digit number");
        } else
            System.out.println("not a 5 digit number");
    }
}
