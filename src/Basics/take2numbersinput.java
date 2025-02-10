package Basics;

import java.util.Scanner;

public class take2numbersinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1 : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the n2 : ");
        double n2 = sc.nextDouble();
        double sum = n1 + n2;
        System.out.println(sum);
//        System.out.print("Result : ");   we can do this also
//        System.out.println(n1+n2);
    }
}
