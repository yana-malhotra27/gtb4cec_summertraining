package Week6;

import java.util.Scanner;

//java is a two face system- compilation face compiler and run time face jvm java virtual machine
//then os operating system demand memory ram divides into two memory stack and heap and goes in stack
//jvm calls main fn and copy gets created of a fn called function frame in stack
//compiler design-syntax analysis and grammatical error
//memory leakage if stack has left some memory
public class revision {
    // public static int add(int a,int b){
    //     int sum=a+b;
    //     //return sum; //helps in returning and wipes out fn
    //     //System.out.println("hello from add"); //error unreachable code compilation error
    //     if(sum==8){
    //         return sum; //conditional returning if na return kiya to what ? that is grammatical error compilation error
    //     }
    //     //System.out.println("Hello");
    //     else{
    //         System.out.println("Hello");
    //         return 10;
    //     }
    // }
    // public static void vadd(int a,int b){ //formal parameters
    //     int sum=a+b;
    //     System.out.println("Hello");
    // }
    // public static void radd(int a){
    //     if(a==3){
    //         return;
    //     }
    //     System.out.println(a);
    //     //radd(a++); //infinite loop
    //     radd(++a); //actual parameters
    // }
    public static int diff(int a,int b){
        return a-b;
    }
    public static int madd(int a,int b){
        int sum=a+b;
        int diff=diff(a,b);
        System.out.println(diff);
        return sum;
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
    public static void printarr(int[][] arr){
        //print zigzag matrix
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        // scan.close();
    }
    public static void main(String[] args) {
        int a=12;
        // if(a==12){
        //     int val=13; //scope only in if block
        //     System.out.println(a); //scope chaining
        // }
        //System.out.println(val); //error
        // System.out.println(a++); //post increment
        // System.out.println(a);
        // System.out.println(a--); //post decrement
        // System.out.println(a);
        //System.out.println(++a++); //value instead of variable
        // System.out.println("hello from Main");
        //System.out.println(add(3,5));
        //System.out.println(vadd(3,5)); //error grammatical
        //int ans=vadd(3,5); //error
        //radd(1);
        // int ans=madd(2,5);
        // System.out.println(ans);
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] arr = new int[r][c];
        insert(arr);
        printarr(arr);
    }
    //fn call gets memory
    //fn inside fn calls controller goes on inside fn and is in running state and other is in posing state
    //fn if return then the value comes where it's been called
    //create a matrix and print in zigzag order
}