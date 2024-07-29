package DSACONTEST1;
// Conversion (Fahrenheit to Celsius)
// Take the following as input.

import java.util.Scanner;

// Minimum Fahrenheit value
// Maximum Fahrenheit value
// Step

// Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
// 0 -17
// 20 -6
// 40 4
// 60 15
// 80 26
// 100 37
public class que7 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int s=sc.nextInt();
		for(int i=start;i<=end;i+=s){
			int m=(5*(i-32))/9;
			System.out.println(i+" "+m);
		}
    }
}
