package Week1;
import java.util.Arrays;
import java.util.Scanner;

public class searching {
    //linear search
    //binary search
    static boolean binarySearch(int arr[],int key){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return true;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    static int binaryindexSearch(int arr[],int key){
        //return index
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binaryindexlowerboundSearch(int arr[],int key){
        //return index of lower bound
        int ans=-1;
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    static int binarypositionupperboundSearch(int arr[],int key){
        //return position (not index) of upper bound
        int ans=-1;
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans = mid+1;
                start = mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //System.out.println(binaryindexSearch(arr,2));
        System.out.println(binarypositionupperboundSearch(arr,2));
    }
}
