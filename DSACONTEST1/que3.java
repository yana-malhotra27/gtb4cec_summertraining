package DSACONTEST1;

import java.util.Scanner;

//Print reverse
//Take N as input, Calculate it's reverse also Print the reverse.
public class que3 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		int reverse=0;
		while(N>0){
			reverse=reverse*10+N%10;
			N/=10;
		}
		System.out.println(reverse);
    }
}
