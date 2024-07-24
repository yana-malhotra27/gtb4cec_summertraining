package Week2;

public class dutchNationalflagalgo {
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        //dutchNationalFlag algorithm
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
            }
        }
    }
}
