package Week1;
import java.util.Scanner;
public class sorting {
    public static void displayArray(int[] arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int[] arr) {
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        displayArray(arr);
        
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        sc.close();
    }
    
}
