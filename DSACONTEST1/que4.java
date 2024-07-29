package DSACONTEST1;

import java.util.Scanner;

//Binary To Decimal
//Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.
public class que4 {
    public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int N = scan.nextInt();
		int i=0;
		int result=0;
		while(N>0){
			result+=(N%10)*Math.pow(2,i);
			i++;
			N/=10;
		}
		System.out.print(result);
    }
}
