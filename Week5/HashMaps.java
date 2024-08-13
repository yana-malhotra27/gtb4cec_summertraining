package Week5;
import java.util.*;
public class HashMaps {
    // static HashMap countmap(int[] arr){
    //     HashMap<Integer,Integer> m=new HashMap<>();
    //     ArrayList<Integer> ar=new ArrayList<>();
    //     for(int x:arr){
    //         if(!ar.contains(x)){
    //             ar.add(x);
    //             int c=0;
    //             for(int i=0;i<arr.length;i++){
    //                 if(x==arr[i]){
    //                     c++;
    //                 }
    //             }
    //             m.put(x,c);
    //         }
    //     }
    //     return m;
    // } 
    static void countmapu(int[] arr){
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:arr){
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }
            else{
                m.put(x,1);
            }
        }
        System.out.println(m);
    } 
    //hashmaps
    public static void main(String[] args) {
        //initialization
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] arr={1,2,3,4,1,2,3,3,3,2};
        //add
        mp.put(1,2);
        mp.put(2,3);
        mp.put(3,4);
        mp.put(4,1);
        mp.put(5,null);
        //display
        System.out.println(mp);
        arr[0]=2;
        arr[1]=4;
        //modify
        mp.put(1,1);
        mp.put(4,2);
        System.out.println(mp);
        //contains
        System.out.println(mp.containsKey(3));
        //remove
        mp.remove(3);
        System.out.println(mp);
        System.out.println(mp.containsKey(3));
        //value access
        System.out.println(mp.get(4));
        System.out.println(mp.get(3));
        //iterate over a map
        for(Map.Entry m:mp.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
        int[] a={1,2,3,4,5,5,4,2,2,2,3,1,4};
        //Map<Integer,Integer> mapu=countmap(a);
        countmapu(a);
        // for(Map.Entry m:mapu.entrySet()){
        //     System.out.println(m.getKey()+":"+m.getValue());
        // }
    }
}