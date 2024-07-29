package DSACONTEST1;
//Shopping Game
// Faculty at CodingBlocks loves to purchase smartphones and decides to play a game. Aayush and Harshit decides to shop for smartphones. Aayush purchases 1 smartphone, then Harshit purchases 2 smartphones, then Aayush purchases 3 smartphones, then Harshit purchases 4 smartphones, and so on. Once someone can't purchase more smartphones, he loses.

import java.util.Scanner;

// Aayush can purchase at most M smartphones and Harshit can purchase at most N smartphones. Who will win ? Print "Aayush" and "Harshit" accordingly.
public class que18 {
    public static int whowin(int a,int h){
		int t=1;
		int s=1;
		while(true){
			if(t==1){
				s++;
				if(a<s){
					return 0;
				}
				t--;
			}
			if(t==0){
				s++;
				if(h<s){
					return 1;
				}
				t++;
			}
		}
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int h=sc.nextInt();
			nums[i]=whowin(a,h);
		}
		for(int i=0;i<n;i++){
			if(nums[i]==0){
				System.out.println("Harshit");
			}
			else{
				System.out.println("Aayush");
			}
		}
    }
}
