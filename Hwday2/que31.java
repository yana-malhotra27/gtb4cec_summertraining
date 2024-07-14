package Hwday2;

import java.util.Scanner;

public class que31 {
    public static void main(String[] args) {
           int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                if(i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
            
        }
    }
}
