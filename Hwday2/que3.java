package Hwday2;

import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    
}