package Week2;

import java.util.Scanner;

public class arr2d {
    public static void displayArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void insert(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        insert(arr);
        displayArray(arr);
        
    }
}