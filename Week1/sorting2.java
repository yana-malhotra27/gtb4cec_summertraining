package Week1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sorting2 {
    public static void displayArray(int[] arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findmaxArray(int[] arr){
        //code for finding max element
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findminArray(int[] arr){
        //code for finding index of min element
        int min=findmaxArray(arr);
        //sir method
        // int min = Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
                c=i;
            }
        }
        return c;
    }
    static int minimumValue(int[] arr){
        //sir method minimum value index
        int mini=0;
        for(int i=1; i<arr.length;i++){
            if(arr[mini]>arr[i]){
                mini=i;
            }
        }
        return mini;
    }
    static int minimumpartValue(int[] arr,int a){
        //sir method minimum value index in a part
        int mini=a;
        for(int i=a+1; i<arr.length;i++){
            if(arr[mini]>arr[i]){
                mini=i;
            }
        }
        return mini;
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=minimumpartValue(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                --j;
            }
            arr[j+1]= key;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println(findminArray(arr));
        //System.out.println(minimumValue(arr));
        //System.out.println(minimumpartValue(arr,2));
        //selectionSort(arr);
        insertionSort(arr);
        //Arrays.sort(arr);
        //displayArray(arr);
        //for each loop
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
