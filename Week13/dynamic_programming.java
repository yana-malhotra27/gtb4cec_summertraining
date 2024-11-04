package Week13;
//leetcode questions-198 and 746
//brute force
//recurssion
//dp
//bottom up approch bestttt (iterative) one for loop
//nge-pre computation
//top down approach-O(n) both time and space recurssion if 5 to 5 se neeche we go
//bottom up approach-O(n) both time and space no recursion we go upto 0 build everything then give value
//dp store and not stored the run fn
public class dynamic_programming {
  //time complexity indirectly proportional to space complexity
  public static int fib(int n){
    //recurssive
    if(n==0 || n==1){
        return n;
    }
    return fib(n-1)+fib(n-2);
    //space complexity very low but time complexity very high
   }
   public static int fibotopdown(int n,int[] dp){
    //top down approach
    if(n==0 || n==1){
        return n;
    }
    //chk if already stored
    if(dp[n]!=0) return dp[n];
    return dp[n]=fibotopdown(n-1,dp)+fibotopdown(n-2,dp);
   }
   //using dp array time complexity turns to be n or 2n ... is n
   //bottom up approach dp[n]=dp[n-1]+dp[n-2]
   public static int fibobottup(int n){
    int[] dp=new int[n+1];
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<dp.length;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
   }
    public static void main(String[] args) {
        //int n=5;
        //System.out.println(fibotopdown(n,new int[n+1]));
        System.out.println(fibobottup(5));
    }
}
