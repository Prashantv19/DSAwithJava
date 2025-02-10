package conditional;

import java.util.Scanner;

public class assignment6SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides ab");
        int ab = sc.nextInt();
        System.out.print("Enter the sides bc");
        int bc = sc.nextInt();
        System.out.print("Enter the sides ca");
        int ca = sc.nextInt();

        if(ab == bc && ca == bc)
            System.out.println("Triangle are equiletral");
        else if(ab == bc || ca == bc || ab == ca)
            System.out.println("Triangle are isosceles");
        else
            System.out.println("Triangle are scalene");
    }
}
