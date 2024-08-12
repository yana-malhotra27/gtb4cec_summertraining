package Week5;
import java.util.*;
//data structure done
//array
//stack
public class Stacksk {
    //stack-LIFO last in first out
    //dynamic memory
    //index starts from 1 from last
    public static int[] NGeRE(int[] user){
        //next greater
        int[] ans=new int[user.length];
        Stack<Integer> st=new Stack<>();
        for(int i=user.length-1;i>=0;i--){
            //step 1
            while(!st.empty() && user[i]>st.peek()){
                st.pop();
            }
            //step 2
            if(st.empty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            //step 3
            st.push(user[i]);
        }
        return ans;
    }
    public static int[] NSeRE(int[] user){
        //next greater
        int[] ans=new int[user.length];
        Stack<Integer> st=new Stack<>();
        for(int i=user.length-1;i>=0;i--){
            //step 1
            while(!st.empty() && user[i]<st.peek()){
                st.pop();
            }
            //step 2
            if(st.empty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            //step 3
            st.push(user[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        // stk.push(1);
        // stk.push(2);
        // stk.push(10);
        // stk.push(20);
        // stk.push(100);
        // stk.push(200);
        // System.out.println(stk.peek());
        // System.out.println(stk.pop());
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int k=sc.nextInt();
        //     stk.push(k);
        // }
        // while(sc.hasNextInt()){
        //     stk.push(sc.nextInt());
        // }
        // System.out.println(stk.search(1)); ////index starts from 1 from last
        // System.out.println(stk.size()-stk.search(1)); //normal indexing
        // System.out.println(stk);
        // while(!stk.empty()){
        //     System.out.println(stk.pop());
        // }
        int[] user={7,3,4,5,9,2};
        //int[] nums=NGeRE(user);
        int[] nums=NSeRE(user);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
