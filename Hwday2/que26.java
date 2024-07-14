package Hwday2;

import java.util.Scanner;
//not
public class que26 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
