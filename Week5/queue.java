package Week5;
import java.util.LinkedList;
import java.util.Queue;

//queue dynamic 90 percent 10 percent static
//fifo first in first out
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //System.out.println(q.element()); //exception if empty
        System.out.println(q.poll()); //null if empty
        //System.out.println(q.remove()); exception if empty
        q.add(1); //exception stack overflow if fix size
        q.offer(10); //false if queue if fixed size
        q.add(10);
        q.add(100);
        q.add(1000);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek()); //null if empty
        System.out.println(q.remove());
        System.out.println(q.poll());
    }
}

