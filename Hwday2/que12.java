package Hwday2;

import java.util.Scanner;

public class que12 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                if(j<i){
                    System.out.print("! ");
                }
            }
            System.out.println();
            
        }
    }
    
}
