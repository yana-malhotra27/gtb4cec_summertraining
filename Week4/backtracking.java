package Week4;

public class backtracking {
    static int sum=0;
    static boolean backtrackSumArray(int[] arr,int i,int k){
        if(i==arr.length){ //base case
            return true;
        }
        if(sum>k){
            return false;
        }
        //include current value in ans
        sum+=arr[i];
        //chk if this can be include in this final ans
        if(!backtrackSumArray(arr,i+1,k)){
            sum-=arr[i]; //revert back
        }
        return true;
    }
    static void sumArrayHead(int[] arr,int i,int k){
        if(i==arr.length && sum<k){
            return ;
        }
        sum+=arr[i];
        if(sum>k){ //kinda backtracking but not cuz no boolean and no riverting back
            sum-=arr[i];
            return ;
        }
        sumArrayHead(arr,i+1,k);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        //sumArrayHead(arr,0,14);
        backtrackSumArray(arr,0,14);
        System.out.println(sum);
    }
        
}