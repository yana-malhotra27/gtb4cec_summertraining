package Week4;

public class towerOfHanoiHW {
    //not corrected incomplete
    static void hanoi(int n,int start,int end){
        if(n==1){
            System.out.println(n);
            return;
        }
        int k=6-(start+end);
        hanoi(n-1,start-1,end);
        hanoi(n-1,start,end-1);
    }
    public static void main(String[] args) {
        hanoi(3,1,3);
    }
}
