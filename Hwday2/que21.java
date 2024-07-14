package Hwday2;

import java.util.Scanner;
//not
public class que21 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int k = 2; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i && j<n; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
