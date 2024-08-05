package Week4;

public class recursion {
    static int sum(int n,int a){
        //first n natural numbers sum
        //tail recurssion
        if(n==1){
            return a+n;
        }
        return sum(n-1,a+n);
    }
    static void print(int n){
        //first n natural numbers print
        //tail recurssion
        //base case
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    static int sumHead(int n){
        //head recurssion
        //base case
        if(n==1){
            return 1;
        }
        //assumption
        int prevValue=sumHead(n-1);
        //proof
        return n+prevValue;
    }
    static int countEven(int n,int count){
        //count even numbers
        //tail recurssion
        if(n==1){
            return count;
        }
        if(n%2==0){
            count++;
        }
        return countEven(n-1, count);
    }
    static int countEvenHead(int n){
        //head recurssion
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return 1+countEvenHead(n-1);
        }
        else{
            return countEvenHead(n-1);
        }
    }
    static int powHead(int base, int pow){
        if(pow==0){
            return 1;
        }
        return base*powHead(base,pow-1);
    }
    static int powTail(int base, int pow,int ans){
        if(pow==0){
            return ans;
        }
        return powTail(base,pow-1,ans*base);
    }
    static int factHead(int n){
        if(n==0){
            return 1;
        }
        return n*factHead(n-1);
    }
    static int factTail(int n,int ans){
        if(n==0){
            return ans;
        }
        else{
            ans=factTail(n-1,ans*n);
        }
        return ans;
    }
    public static void main(String[] args) {
        //first n natural numbers print
        // int n=1;
        // while(n<=10){
        //     System.out.println(n);
        //     n++;
        //}
        //print(1);
        //first n natural numbers sum
        // int n=10;
        // int sum=0;
        // for(int i=1;i<=n;i++){ //int i=n;i>=1;i--
        //     sum+=i; 
        // }
        // System.out.println(sum);
        //System.out.println(sum(10,0));
        //System.out.println(countEven(10,0));
        //System.out.println(sumHead(10));
        //System.out.println(countEvenHead(10));
        //System.out.println(powHead(3,4));
        //System.out.println(powTail(3,4,1));
        //System.out.println(factHead(5));
        System.out.println(factTail(5,1));
    }

}