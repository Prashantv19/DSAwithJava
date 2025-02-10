package conditional;

import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n<0){
            System.out.print("absolute no ");
            System.out.println(-n);
        } else{
            System.out.println(n);
        }
    }
}
