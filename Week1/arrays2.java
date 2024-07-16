package Week1;
import java.util.Scanner;
//import java.util.Arrays;
//int maximum=Collection.max(Arrays.asList(arr));
//hw:for each loop study
public class arrays2 {
    public static int displaysumArray(int[] arr){
        //code for displaying my array sum
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
        }
        return c;
    }
    public static void displayArray(int[] arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findArray(int[] arr,int b){
        //code for finding
        for(int i=0;i<arr.length;i++){
            if (b==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void swap(int a,int b){
        //code for swapping
        int c;
        c=a;
        a=b;
        b=c;
    }
    public static void change(int[] adi, int i, int j){
        int temp=adi[i];
        adi[i]=adi[j];
        adi[j]=temp;
    }
    public static void swapArray(int[] arr){
        //code for reverse an array
        int i=0;
        int j=arr.length-1;
        while(i<j){
            change(arr,i++,j--);
        }
    }
    //problem
    public static void swappartArray(int[] arr, int i, int j){
        //code for reverse an array only a part
        while(i<j){
            change(arr,i++,j--);
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
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // int b;
        // int a;
        // Scanner s = new Scanner(System.in);
        // a= s.nextInt();
        // b= s.nextInt();
        //System.out.println(displaysumArray(arr));
        //System.out.println(findArray(arr,b));
        //swap(a,b);
        //System.out.println(a+" "+b);
        // swapArray(arr);
        // displayArray(arr);
        //System.out.println(findmaxArray(arr));
        // problem
        swappartArray(arr,2,6);
        displayArray(arr);
    }
}
