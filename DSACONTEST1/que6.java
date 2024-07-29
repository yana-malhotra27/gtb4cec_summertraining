package DSACONTEST1;

import java.util.Scanner;

//Nth Fibonacci (Hard)
//Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.
public class que6 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr= new int[N+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<N+1;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.print(arr[N]);
    }
}
