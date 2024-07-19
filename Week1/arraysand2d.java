package Week1;

public class arraysand2d {
    public static void displayArray(int[] arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void generatesubArray(int[] arr){
        //generate all sub array
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
    public static void generatesubsumArray(int[] arr){
        //generate all sub array sum
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int c=0;
                for(int k=i;k<=j;k++){
                    c+=arr[k];
                }
                System.out.println(c);
            }
        }
    }
    public static void generatesubsummaxArray(int[] arr){
        //generate all sub array max array (time exceed time complexity)
        int c=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int x=0;
                for(int k=i;k<=j;k++){
                    x+=arr[k];
                    c=Math.max(x,c);
                }
            }
        }
        System.out.println(c);
    }
    static int kadaneAlgo(int[] arr){
        //generate all sub array max array BY KADANE'S ALGORITHM
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void rotateArray(int[] arr){
        //rotate by 1
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void rotatekArray(int[] arr,int k){
        //rotate by k
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[(i+k)%arr.length]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr2[i];
        }
    }
    public static void rotatebyk(int[] arr, int i, int j){
        //code for rotate by k optimised good time complexity
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotatebykbetter(int[] nums, int k) {
        //code for rotate by k better
        k%=nums.length;
        rotatebyk(nums,0,nums.length-1);
        rotatebyk(nums,0,k-1);
        rotatebyk(nums,k,nums.length-1);
        
    }
    //generate all subarrays
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //System.out.println(kadaneAlgo(arr));
        rotatebykbetter(arr,2);
        displayArray(arr);
    }
    
}
