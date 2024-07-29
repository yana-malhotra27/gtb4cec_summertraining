package DSACONTEST1;
//Is Armstrong Number
// Take the following as input.

import java.util.Scanner;

// A number
// Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows.

// A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.

// abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

// 1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3
public class que20 {
    public static int countDigits(int N){
		int m=N;
		int co=0;
		while(m>0){
			m/=10;
			co++;
		}
		return co;
	}
	public static boolean checkArmstrong(int N,int c){
		int original=N;
		int sum=0;
		while(N>0){
			sum+=Math.pow(N%10,c);
			N/=10;
		}
		if(sum==original){
			return true;
		}
		return false;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int c=countDigits(N);
		System.out.println(checkArmstrong(N,c));
    }
}
