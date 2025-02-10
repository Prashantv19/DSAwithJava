package conditional;
import java.util.Scanner;
public class XaxisYaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X axis: ");
        int a = sc.nextInt();
        System.out.print("Enter Y axis: ");
        int b = sc.nextInt();
        if (a == 0 && b == 0) System.out.println("on origin");
        else if (a == 0 && b == b) System.out.println("on Y axis");
        else if (a == a && b == 0) System.out.println("on X axis");
        else if (a > 0 && b > 0) System.out.println("in 1st quadrant");
        else if (a < 0 && b > 0) System.out.println("in 2nd quadrant");
        else if (a < 0 && b < 0) System.out.println("in 3rd quadrant");
        else System.out.println("in 4th quadrant");

    }
}
