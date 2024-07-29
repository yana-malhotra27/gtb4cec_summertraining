package DSACONTEST1;
//Print Series
// Take the following as input.

import java.util.Scanner;

// A number (N1)
// A number (N2)
// Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
public class que13 {
    static boolean range(int n1, int n2){
		int j=0;
		for(int i=1;i<100;i++){
			int x=(3*i)+2;
			if(x%n2!=0){
				j++;
				if(j<=n1){
					System.out.println(x);
				}
			}
		}
		return false;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		range(n1,n2);
    }
}
