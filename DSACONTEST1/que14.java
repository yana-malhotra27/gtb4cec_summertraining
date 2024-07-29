package DSACONTEST1;

import java.util.Scanner;

//Simple Input
//Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
public class que14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int s=0;
        while(s>=0){
            int a=sc.nextInt();
			s+=a;
			if(s>=0){
				System.out.println(a);
			}
		}
    }
}
