package DSACONTEST1;

import java.util.Scanner;

//Replace Them All
//Given a integer as a input and replace all the '0' with '5' in the integer
public class que12 {
    static long rev(long n){
		long v=0;
		while(n>0){
				if(n%10!=0){
					v=(v*10)+(n%10);
				}
				else{
					v=v*10+5;
				}
				n/=10;
		}
		return v;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long f=0;
		long m=0;
		if(N==0){
			System.out.print(5);
		}
		else{
			while(N>0){
				m=m*10+N%10;
				N/=10;
			}
			System.out.print(rev(m));
		}
    }

}
