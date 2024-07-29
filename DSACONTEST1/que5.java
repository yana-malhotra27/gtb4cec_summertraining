package DSACONTEST1;
//LCM
// Take the following as input.

import java.util.Scanner;

// A number (N1)
// A number (N2)
// Write a function which returns the LCM of N1 and N2. Print the value returned.
public class que5 {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=Math.min(a,b);
		int gcd=0;
		for(int i=1;i<=n;i++){
			if(a%i==0 && b%i==0){
				gcd=i;
			}
		}
		System.out.print((a*b)/gcd);
    }
}
