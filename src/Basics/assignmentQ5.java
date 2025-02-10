package Basics;

import java.util.Scanner;

public class assignmentQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);

        System.out.print("Enter Principle Amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest : ");
        double r = sc.nextDouble();
        System.out.print("Enter time : ");
        double t = sc.nextDouble();
        double si = p*r*t/100;
        System.out.println("The interest is " + si);
    }
}
