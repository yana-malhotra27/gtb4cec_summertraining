package Hwday2;

import java.util.Scanner;

//not
public class que29 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = i;
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j1 = 1; j1 <= i; j1++) {
                if (j1 == 1) {
                    System.out.print(count + " ");
                } else {
                    System.out.print("0 ");
                }

            }

            for (int j2 = 2; j2 <= i; j2++) {

                if (j2 == i) {
                    System.out.print(count + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }

    }
}
