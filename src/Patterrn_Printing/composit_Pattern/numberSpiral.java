package Patterrn_Printing.composit_Pattern;
import java.util.Scanner;
public class numberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){             // 1 to 2n-1 tak loop chalega
            for (int j = 1; j <=2*n-1 ; j++) {     // 1 to 2n-1 tak loop chalega
                int a=i, b=j;
                if(i>n) a = 2*n-i;           // agar i, n se bada ho to a = 2*n-i
                if (j>n) b = 2*n-j;            // agar j, n se bada ho to b = 2*n-j
                System.out.print((n+1)-(Math.min(a,b))+" ");  //  a and b mese jo chota ho usko n+1 mese ghta kar print kar do

            }
            System.out.println();
        }
    }
}
