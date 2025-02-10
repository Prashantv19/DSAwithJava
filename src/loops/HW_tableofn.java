package loops;

import java.util.Scanner;

public class HW_tableofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i<=(10*n);i+=n)
            System.out.println(i);
    }
}
