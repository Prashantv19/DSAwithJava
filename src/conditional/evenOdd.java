package conditional;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("even"); //agar if condition such huyi tabhi ye print hoga warna kuch bhi print nhi hoga
        if(n%2 == 1) System.out.println("odd");
        else System.out.println("odd");     // agar ye hai toh print karo warna ye print karo
    }
}
