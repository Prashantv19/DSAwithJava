package conditional;

import java.util.Scanner;

public class greatestofthreenestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {                                         //agar ye condition false ho gyi toh automatically b > a ho jayega.
            if (a > c) System.out.println(a + "is largest"); // agar ye condition false ho gyi toh automatically c > a ho jayega.
            else  // c>= a>b
                System.out.println(c + "is largest");
        } else { // b>=a
            if (b > c) System.out.println(b + "is largest"); //agar ye condition false ho gyi toh automatically c > b ho jayega.
            else // c >= b >= a
                System.out.println(c + "is largest");
        }


    }
}

