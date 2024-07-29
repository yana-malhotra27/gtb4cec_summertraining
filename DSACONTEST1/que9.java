package DSACONTEST1;

import java.util.Scanner;

//Check prime
//Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
public class que9 {
    public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int m=0;
		for(int i=2;i<N;i++){
			if(N%i==0){
				System.out.println("Not Prime");
				m++;
				break;
			}
		}
		if(m==0){
			System.out.println("Prime");
		}

    }
}
