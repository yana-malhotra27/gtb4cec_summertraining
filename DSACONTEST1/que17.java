package DSACONTEST1;

import java.util.Scanner;

//Boston Numbers
//A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.
public class que17 {
    static boolean prime(int p){
		for(int i=2;i<p;i++){
			if(p%i==0){
				return false;
			}
		}
		return true;
	}
	static int digitSum(int m){
		int sum=0;
		while(m>0){
			sum+=m%10;
			m/=10;
		}
		return sum;
	}
	static int pfSum(int N){
		int psum=0;
		for(int i=2;i<=N;i++){
			while(N%i==0 && prime(i)==true){
				if(i > 9){
					psum+=digitSum(i);
				}
				else
					psum+=i;
				N/=i;
			}
		}
		return psum;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=N;
		int m=N;
		int d=digitSum(m);
		int f=pfSum(N);
		if(d==f && a>2){
			System.out.print(1);
		}
		else{
			System.out.print(0);
		}

    }
}
