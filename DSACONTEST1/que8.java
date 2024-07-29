package DSACONTEST1;
//Inverse of number
// Take the following as input.
// A number
// Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.

import java.util.Scanner;

// Write a function that returns its inverse, where inverse is defined as follows

// Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.

// Print the value returned.
public class que8 {
    static int countDigits(int n){
		int m=0;
		int a=n;
		while(a>0){
			a/=10;
			m++;
		}
		return m;
	}
	// static void inverse(int n,int[] arr){
	// 	int m=n;
	// 	int i=1;
	// 	while(m>0){
	// 		arr[(m%10)-1]=i;
	// 		m/=10;
	// 		i++;
	// 	}
	// }
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count= countDigits(n);
		int[] arr= new int[count];
		for(int i=arr.length-1; i>=0;i--){
			arr[i]=n%10;
			n/=10;
		}
		int[] nums= new int[count];
		//logic
		for(int i=0;i<arr.length;i++){
			nums[arr[i]-1]=count-i;
		}
		//display
		for(int i=nums.length-1; i>=0;i--) System.out.print(nums[i]);
		// for(int i=0;i<arr.length;i++)
		// 	System.out.print(nums[i]);
		// int[] arr= new int[countDigits(n)];
		// inverse(n,arr);
		// for(int i=arr.length-1;i>=0;i--){
		// 	System.out.print(arr[i]);
		// }
    }
}
