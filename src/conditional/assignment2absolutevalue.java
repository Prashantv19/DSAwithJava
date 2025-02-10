package conditional;

import java.util.Scanner;

public class assignment2absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num<0) System.out.println(-num);
        else if(num>0) System.out.println(num);
        else System.out.println("0");

    }
}
