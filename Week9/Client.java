package Week9;

public class Client {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();
        System.out.println(ll.size());
        ll.addLast(100);
        ll.display();
        ll.addAtIndex(50,2);
        ll.display();
    }
}
