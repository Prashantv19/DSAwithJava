package Practice;

import java.util.Scanner;

public class tableofn {
    public static void main(String[] args) {
        System.out.print("Enter NO. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Table of "+n);
        for (int i = n; i<=(n*10) ; i+=n) {
            System.out.println(i);
        }
    }
}
