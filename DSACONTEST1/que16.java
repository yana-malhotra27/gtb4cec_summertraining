package DSACONTEST1;

import java.util.Scanner;

//Conversion(Any To Any)
// Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.
public class que16 {
    static int todec(int n,int base){
		int s=0;
		int i=0;
		while(n>0){
			s+=(n%10)*Math.pow(base,i);
			n/=10;
			i++;
		}
		return s;
	}
	static String tobin(int n,int base){
		StringBuilder s = new StringBuilder();;
		while(0<n){
			int k=n%base;
			if(k>=10){
				s.append((char) ('A'+(k-10)));				
			}
			else{
				s.append(k);
			}
			n/=base;
		}
		return s.reverse().toString();
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sb=sc.nextInt();
		int db=sc.nextInt();
		int sn=sc.nextInt();
		int b=todec(sn,sb);
		String s=tobin(b,db);
		System.out.print(s);
    }
}
