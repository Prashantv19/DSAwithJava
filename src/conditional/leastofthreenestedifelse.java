package conditional;

import java.util.Scanner;

public class leastofthreenestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt(); // Ram
        System.out.println("Enter the second number : ");
        int b = sc.nextInt(); // Shyam
        System.out.println("Enter the third number : ");
        int c = sc.nextInt(); // Ajay
        if (a<b){    // sabse pahle ye check hoga, agar ye galat huaa toh direct else pe chala jayega.agar ye condition false ho gyi toh automatically b < a ho jayega.
            if(a<c) System.out.println(a+"is smallest"); //a<b<c = a is least [agar ye condition false ho gyi toh automatically c < a ho jayega.]
            else System.out.println(c+"is smallest"); // agar a and c same hai toh c print hoga
        }
        else{
            if (b<c) System.out.println(b+"is smallest"); // agar ye condition false ho gyi toh automatically c<b ho jayega.
            else  System.out.println(c+"is smallest");
        }

    }
}
