package Week3;

import java.util.ArrayList;
import java.util.Collections;

public class arrayLists {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> arr=new ArrayList<>(2);
        System.out.println(arr.size()); // calc size before '\n' or other symbol
        System.out.println(arr);
        //add
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.size());
        //access
        System.out.println(arr.get(0));
        //remove
        System.out.println(arr.remove(0));// gives element that is removed
        System.out.println(arr.get(0));
        //update
        arr.set(0, 10); //return old value
        System.out.println(arr);
        //sort
        Collections.sort(arr);
        System.out.println(arr);
    }
}
