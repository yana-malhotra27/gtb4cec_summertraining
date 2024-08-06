package Week4;

public class coin_toss {
    static void tosstail(int n,String ans){
        //print all the outcomes when n was tossed
        if(n==0){
            System.out.println(ans);
            return;
        }
        tosstail(n-1,ans+"H");
        tosstail(n-1,ans+"T");
    }
    static void subsequencestail(String n,String ans){
        //generate subsequences
        if(n.isEmpty()){
            System.out.println(ans);
            return;
        }
        subsequencestail(n.substring(1,n.length()),ans+n.charAt(0));
        subsequencestail(n.substring(1,n.length()),ans);
    }
    static int subsequencescounthead(String n){
        //count subsequences Math.pow(2,n.length()) idk
        if(n.isEmpty()){
            return 1;
        }
        int c1=subsequencescounthead(n.substring(1));
        //int c2=subsequencescounthead(n.substring(1));
        return c1*2;
    }
    public static void main(String[] args) {
        //tosstail(3,"");
        //subsequencestail("car", "");
        System.out.println(subsequencescounthead("car"));
    }
}