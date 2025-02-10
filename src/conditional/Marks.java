package conditional;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int n = sc.nextInt();
        if(n >= 81) System.out.println("very good");  // agar if satatement chal gya toh niche else if ke sare statement discard ho jayenge
        else if (n >= 61) System.out.println("good");  // agar ye chal rha hai matlab if statement wrong hai
        else if (n >= 41) System.out.println("Average");
        else System.out.println("fail");

    }
}
