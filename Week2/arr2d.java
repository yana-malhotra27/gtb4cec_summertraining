package Week2;

import java.util.*;
public class arr2d {
    //sort
    public static void sortbyCol(int arr[][], int col){
        Arrays.sort(arr,(a,b)->Integer.compare(a[col],b[col]));
    }
    static void sortallRows(int arr[][]){
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
    }
    //int and search and index
    public static int[] search(int[][] arr,int n){
        int[] m={-1,-1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(n==arr[i][j]){
                    m[0]=i;
                    m[1]=j;
                    return m;
                }
            }
        }
        return m;
    }
    public static void transpose(int[][] arr,int[][] nums){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                nums[j][i]=arr[i][j];
            }
        }
    }
    public static void displayArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void display(int[] arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insert(int[][] arr){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        // scan.close();
    }
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        int[][] nums=new int[arr[0].length][arr.length];
        Scanner sc = new Scanner(System.in);
        // insert(arr);
        // displayArray(arr);
        // int n=sc.nextInt();
        // int[] v=search(arr,n);
        // for(int i=0;i<v.length;i++){
        //     System.out.println(v[i]);
        // }
        // transpose(arr,nums);
        // displayArray(nums);
        sc.close();
        int[][] a={
            {2,4,2,1},
            {4,5,2,4},
            {9,7,1}
        };
        int[][] b={
            {2,4,2,5},
            {4,5,2,4},
            {9,7,1,7}
        };
        //Arrays.sort() not start in java
        //displayArray(a);
        //sortbyCol(b,3);
        // sortallRows(b);
        // sortbyCol(b,0);
        // displayArray(b);
        //hw
        //Array Flattening
        int[] kk=new int[(b[0].length)*(b.length)];
        int k=0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                kk[k]=b[i][j];
                k++;
            }
        }
        // for(int i=0;i<b.length;i++){
        //     for(int j=0;j<b[i].length;j++){
        //         b[i][j]=kk[((b[0].length)*i)+j]; //sir method formula in place of k
        //     }
        // }
        Arrays.sort(kk);
        for(int i=0;i<kk.length;i++){
            b[i/(b[0].length)][i%(b[0].length)]=kk[i]; //sir method
        }
        displayArray(b);
        //display(kk);
    }
}