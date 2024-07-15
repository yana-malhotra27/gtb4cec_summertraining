package Hwday2;

import java.util.Scanner;
//not
public class que33 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = n - i + 1;
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                if (count == 10) {
                    System.out.print("0 ");
                }

                else {
                    System.out.print(count + " ");
                    count++;
                }

            }
            for (int j = 2; j <= i; j++) {
                count--;
                System.out.print(count + " ");

            }

            System.out.println();
        }
        //sc.close();    add this later
    
    }
}
