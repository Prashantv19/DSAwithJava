package conditional;

import java.util.Scanner;

public class HW_areapermiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Width: ");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("Area is "+area);
        int perimeter = 2*(l*b);
        System.out.println("Perimeter is "+perimeter);
        if (area > perimeter) {
            System.out.println("Area is greater than perimeter ");
        }
        if (area < perimeter) {
            System.out.println("Area is less than perimeter ");
        }
    }
}
