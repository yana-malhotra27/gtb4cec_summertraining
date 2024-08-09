package Week1;

import java.util.Scanner;

public class arrays {
    public static void displayArray(int[] arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int reverseNumber(int m){
        int x=0;//initialization
        while(m>0){//condition
            x=x*10 + m%10;
            m/=10;//change
        }
        return x;
    }
    public static int countDigits(int m){
        int f= m;
        int x=0;
        while(f>0){
            x++;
            f/=10;
        }
        return x;

    }
    public static boolean checkArmstrong(int m){
        int a=countDigits(m);
        int sum=0;
        int b=0;
        int c = m;
        while(c>0){
            b=c%10;
            sum+=Math.pow(b,a);//implicit
            //sum = sum +(int) Math.pow(a,b); explicit
            b=0;
            c/=10;
        }
        if (sum==m){
            return true;
        }
        else{
            return false;
        }
    }
    //que make fn primeNumber returns True False
    public static boolean primeNumber(int m){
        int c = 0;
        for(int i=1;i<=m;i++){
            if(m%i==0){
                c++;
            }
        }
        if(c>2){
            return(false);
        }
        else{
            return(true);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr);
        char[] a = new char[10];
        System.out.println(a);
        String s="abc"; //same char
        System.out.println(s);
        float[] ar = new float[10];
        System.out.println(ar);
        arr[1]=10;
        arr[6]=110;
        displayArray(arr);
        int m;
        Scanner sc = new Scanner(System.in);
        m= sc.nextInt();
        //System.out.println(primeNumber(m));
        //System.out.println(reverseNumber(m));
        //System.out.println(countDigits(m));
        System.out.println(checkArmstrong(m));
        sc.close();
    }
    
}
