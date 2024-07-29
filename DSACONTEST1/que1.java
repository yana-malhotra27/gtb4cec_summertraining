package DSACONTEST1;
//STOOD AT 1ST POSITION TOTAL 2000 POINTS WITH 20 QUESTIONS EACH OF 100 MARKS
import java.util.Scanner;
//Sum of odd placed and even placed digits
//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
public class que1 {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int x=1;
		int o=0;
		int e=0;
		while(N>0){
			int f=N%10;
			N/=10;
			if(x%2==0){
				e+=f;
				x+=1;
			}
			else{
				o+=f;
				x++;
			}	
		}
		System.out.println(o);
		System.out.print(e);

    }
}
