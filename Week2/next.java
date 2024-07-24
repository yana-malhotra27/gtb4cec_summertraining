package Week2;

public class next {
    public static void displayArray(int[] arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void NGRNI(int[] nums,int[] arr){
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=maxR;
            maxR=Math.max(maxR, nums[i]);
        }
    }
    public static void NGRCI(int[] nums,int[] arr){
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--){
            maxR=Math.max(maxR, nums[i]);
            arr[i]=maxR;
        }
    }
    public static void NGLNI(int[] nums,int[] arr){
        int maxR=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=maxR;
            maxR=Math.max(maxR, nums[i]);
        }
    }
    public static void NGLCI(int[] nums,int[] arr){
        int maxR=0;
        for(int i=0;i<nums.length;i++){
            maxR=Math.max(maxR, nums[i]);
            arr[i]=maxR;
        }
    }
    public static void NSRNI(int[] nums,int[] arr){
        int minR=100;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=minR;
            minR=Math.min(minR, nums[i]);
        }
    }
    public static void NSRCI(int[] nums,int[] arr){
        int minR=100;
        for(int i=nums.length-1;i>=0;i--){
            minR=Math.min(minR, nums[i]);
            arr[i]=minR;
        }
    }
    public static void NSLNI(int[] nums,int[] arr){
        int minR=100;
        for(int i=0;i<nums.length;i++){
            minR=Math.min(minR, nums[i]);
            arr[i]=minR;
        }
    }
    public static void NSLCI(int[] nums,int[] arr){
        int minR=100;
        for(int i=0;i<nums.length;i++){
            arr[i]=minR;
            minR=Math.min(minR, nums[i]);
        }
    }
    public static void main(String[] args) {
        //NGR next greatest to the right when current element is not included
        int[] nums={2,3,1,8,7,3,4};
        int[] arr=new int[nums.length];
        //NGRNI(nums,arr);
        //NGRCI(nums,arr);
        //NGLNI(nums, arr);
        //NGLCI(nums,arr);
        NSRNI(nums,arr);
        //NSRCI(nums,arr);
        //NSLNI(nums,arr);
        //NSLCI(nums,arr);
        displayArray(arr);

    }
}
