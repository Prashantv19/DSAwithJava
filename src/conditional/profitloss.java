package conditional;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();
        if (sp>cp) {
            System.out.println("Profit is : " +(sp-cp));
        }
        if (cp > sp) {
            System.out.println("Loss is : " +(cp-sp));
        }
        if (cp == sp) {
            System.out.println("No Profit No Loss");

        }

//        else System.out.println("Not Profit No Loss");

    }
}
