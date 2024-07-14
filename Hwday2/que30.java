package Hwday2;

import java.util.Scanner;

public class que30 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
}
