package DSACONTEST1;
//Chewbacca and Number
// Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

import java.util.Scanner;

// Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.
public class que11 {
    static void reverse(long nums[]){
		// long b=0;
		// int t=0;
		// while(f>0){
		// 	t++;
		// 	if(t==1 && f%10==0){
		// 		b=9;
		// 		f/=10;
		// 		t++;
		// 	}
		// 	else{
		// 		b=(b*10)+(f%10);
		// 		f/=10;
		// 		t++;
		// 	}

		// }
		// return b;
		if(nums[nums.length-1]==0){
			nums[nums.length-1]=9;
		}
		for(int i=nums.length-1;i>=0;i--){
			System.out.print(nums[i]);
		}

	}
	public static int countDigits(long m){
        long f= m;
        int x=0;
        while(f>0){
            x++;
            f/=10;
        }
        return x;

    }
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		long n=sc.nextLong();
		int k=countDigits(n);
		long[] nums=new long[k];
		long m=n;
		long f=0;
		int i=0;
		if(n==0){
			System.out.println(0);
			return;
		}
		i=0;
		while(m>0){
			long a=m%10;
			long b=9-(a);
			if(b<a){
				a=b;
			}
			nums[i]=a;
			m/=10;
			i++;
		}
		reverse(nums);
    }
}
