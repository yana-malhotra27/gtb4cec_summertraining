package DSACONTEST1;

import java.util.Scanner;

//Odd and Even back in Delhi
//Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
public class que19 {
    static int eos(int k,int i){
		int m=k;
		int f=0,e=0,o=0;
		while(m>0){
			if((m%10)%2==0){
				e+=m%10;
			}
			else{
				o+=m%10;
			}
			m/=10;
		}
		if(e%4==0 || o%3==0){
			return 1;
		}
		else{
			return 0;
		}
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
	    int[] ans=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			ans[i]=eos(arr[i],i);
		}
		for(int i=0;i<n;i++){
			if(ans[i]==0){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
    }
}
