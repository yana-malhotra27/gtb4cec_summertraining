package Hwday2;

import java.util.Scanner;
//not
public class que25 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("   ");
            }
            
            for (int j = 1; j <= i; j++) {
                if(count<10){
                System.out.print(count + "  ");
                }
                else{
                    System.out.print(count + " ");
                }
                count++;
            }
           
            for (int j = 1; j <= i - 1; j++) {
                if(count<10){
                    System.out.print(count + "  ");
                    }
                    else{
                        System.out.print(count +" ");
                    }
                count++;
            }
            System.out.println();
            
        }
    }
    
}
