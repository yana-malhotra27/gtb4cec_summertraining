package Hwday2;

import java.util.Scanner;

public class que23 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("1 ");
            for(int j=2;j<=i;j++) System.out.print("1 ");
            System.out.println();
        }
    }
}
