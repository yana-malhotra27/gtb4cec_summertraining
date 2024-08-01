package Week3;

import java.util.Arrays;

public class Stringweek3 {
    public static void stringadd1(String s1, String s7) {
        //Create a String s="your_name"+1 successor of name
        for(int i=0;i<s1.length();i++){
            s7+=(char)(s1.charAt(i)+1);
        }
        System.out.println(s7);
    }
    public static String stringReverse(String s1) {
        //reverse string
        String s7="";
        for(int i=s1.length()-1;i>=0;i--){
            s7+=s1.charAt(i);
        }
        return s7;
    }
    public static int palindrome(String s7) {
        //palindrome
        //String s8=s7;
        //stringReverse(s7);
        // if(s7==s8){
        //     return true;
        // }
        // return false;
        //return(s7.equalsIgnoreCase(stringReverse(s7)));
        return s7.compareTo(stringReverse(s7)); // 0 means equal
    }
    public static String reverseSentence(String s99) {
        //reverse sentence
        s99= s99.trim();
        String[] arr= s99.split(" ");
        String ans= "";
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
        }
        return ans.trim();
    }
    public static void stringrange(String m,int i, int j) {
        //return a given range of string
        System.out.println(m.substring(i,j+1));
        // String sk="";
        // while(i<=j){
        //     sk+=m.charAt(i);
        //     i++;
        // }
        // return sk;
    }
    public static int longestsamecharSubstring(String m) {
        //return the length of the longest same char Substring
        char k=m.charAt(0);
        int c=0;
        int len=0;
        for(int i=0;i<m.length();i++){
            if(k==m.charAt(i)){
                len++;
            }
            else{
                k=m.charAt(i); 
                c=Math.max(c,len);               
                len=1;
            }
        }
        return c;
        
    }
    public static void main(String[] args) {
        String s1 = "hi";
        String s7 = "";
        String s2 = new String("hi");
        String s3 = "hi"; // string is a wrapper class not a data structure
        char[] s4 = {'h','i'};
        char[] s5 = {'h','i'};
        System.out.println(s5==s4); //address compare
        System.out.println(s5==s4);
        s3="hi";
        System.out.println(s1==s3);
        System.out.println(s4[1]+" "+s1.charAt(1));
        stringadd1(s1,s7);
        //stringReverse(s1);
        String s9="noon";
        System.out.println(palindrome(s9));
        String ss="A";
        String sss="a";
        System.out.println(sss.compareTo(ss));
        System.out.println(ss.compareTo(sss));
        System.out.println(reverseSentence("This is a car"));
        stringrange("this s",0,2);
        System.out.println(longestsamecharSubstring("sssskkkj"));
    }
}
