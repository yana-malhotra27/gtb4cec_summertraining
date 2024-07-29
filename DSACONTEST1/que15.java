package DSACONTEST1;
//Print Armstrong Numbers
// Take the following as input.

import java.util.Scanner;

// A number (N1)
// A number (N2)
// Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3
public class que15 {
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
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++){
			if(checkArmstrong(i,countDigits(i))){
				System.out.println(i);
			}
		}

    }
}
