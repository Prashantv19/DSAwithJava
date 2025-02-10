package loops;

import java.util.Scanner;

public class breakKeyword_CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <=n-1; i++) {
            if (n % i == 0)
                System.out.println("Composite number");        // without break statement ye utni baar print hoga jitna input number ke factor honge
            break;     // iska use karne se loop bich me tod deta hai, loop se bahar nikal deta hai
        }
    }
}
