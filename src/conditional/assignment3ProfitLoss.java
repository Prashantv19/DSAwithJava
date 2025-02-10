package conditional;

import java.util.Scanner;

public class assignment3ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost price : ");
        int cp = sc.nextInt();
        System.out.print("enter the selling price : ");
        int sp = sc.nextInt();
        if (cp > sp) {
            System.out.println((cp - sp) +"is Loss");
        }
        else if (cp < sp) {
            System.out.println((sp - cp) +"is Profit");
        }
        else System.out.println("Neither Profit nor Loss");
    }
}
