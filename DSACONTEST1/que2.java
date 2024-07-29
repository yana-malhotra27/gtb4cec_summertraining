package DSACONTEST1;

import java.util.Scanner;

//Count Digits
// Take the following as input.
// A number
// A digit
// Write a function that returns the number of times digit is found in the number. Print the value returned.
public class que2 {
    public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int N = scan.nextInt();
		int n = scan.nextInt();
		int c=0;
		while(N>0){
			if(N%10==n){
				c++;
			}
			N/=10;
		}
		System.out.print(c);
    }
}
