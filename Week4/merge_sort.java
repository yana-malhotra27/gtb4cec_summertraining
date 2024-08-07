package Week4;

public class merge_sort {
    static void merge(int[] arr, int low, int mid, int high) {
        int size=high-low+1;
        int[] temp=new int[size];
        int i=mid,j=high,k=size-1;
        while(i>=low && j>=mid+1){
            if(arr[i]>arr[j]){
                temp[k]=arr[i];
                i--;
            }
            else{
                temp[k]=arr[j];
                j--;
            }
            k--;
        }
        while(i>=low){
            temp[k]=arr[i];
            i--;
            k--;
        }
        while(j>=mid+1){
            temp[k]=arr[j];
            k--;
            j--;
        }
        for(i=low;i<=high;i++){ //deep copy ig
            arr[i]=temp[i-low];
        }
        // for(i=mid+1;i<=high;i++){
        //     arr[i]=temp[i-low];
        // }
    }
    static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid=(high+low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,3,6};
        int low=0;
        int high=arr.length-1;
        //int mid=(low+high)/2;
        //merge(arr,low,mid,high);
        mergeSort(arr,low,high);
        for(int i:arr)System.out.print(i+" ");
    }
}
