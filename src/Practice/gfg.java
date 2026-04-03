package Practice;

import java.util.Scanner;

public class gfg {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s1 = Integer.toString(a);
            String s2 = Integer.toString(b);
            String concatenatedString = " " + s1 + s2;
            System.out.println("Concatenated String:" + concatenatedString);
        }
    }
