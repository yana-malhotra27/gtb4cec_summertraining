package Hwday2;

import java.util.Scanner;
//not
public class que19 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i=n-3; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
        }
        for (int k=4; k<=n-i; k++){
            System.out.print("  ");
        }
        for (int k=4; k<=n-i; k++){
            System.out.print("  ");
        }
        for (int j=1; j<=i; j++){
            System.out.print("* ");
        }

        System.out.println("");
        }

        for (int i=1; i<=n-3; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
        for (int k=4; k<=n-i; k++){
            System.out.print("  ");
        }
        for (int k=4; k<=n-i; k++){
            System.out.print("  ");
        }
        for (int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println("");
        }
    }
}
