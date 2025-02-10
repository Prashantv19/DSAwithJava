package conditional;

import java.util.Scanner;

public class assignment7leastofthreeusingnestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<=b){
            if(a<=c) System.out.println(a+"is least");
            else System.out.println(c+"is least");
        }
        else if(b<=c)System.out.println(b+"is least");
        else System.out.println(c+"is least");

    }
}
