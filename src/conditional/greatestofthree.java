package conditional;

import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) System.out.println(a + "is greatest");  // agar ek condition false huyi toh code aage chalega hi nhi(dusari line pe chala jayega), aur agar dono true hoga toh aage ke code discard ho jayenge
//        if (b > a && b > c) System.out.println(b + "is greatest");
//        if (c > a && c > b) System.out.println(c + "is greatest");
        else if (b >= a && b >= c) System.out.println(b + "is greatest"); // agar if condition me ek bhi condition false hoga toh hi else if pe aayega
        else System.out.println(c + "is greatest");
    }
}