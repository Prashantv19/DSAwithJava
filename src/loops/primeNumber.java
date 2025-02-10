package loops;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x =0;  // let 0 means prime for now
        for (int i = 2; i <=n-1; i++)
            if (n % i == 0) {
                System.out.println("Composite number");
                x = 1;  // let 1 means composite number for now
                break;
            }

        if (n==1) System.out.println("neither Prime nor Composite");
        else if(x==0) System.out.println("Prime Number");
    }
}
