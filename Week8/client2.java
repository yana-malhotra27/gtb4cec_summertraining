package Week8;

public class client2 {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        // list.InsertAtBegin(12);
        // list.InsertAtBegin(13);
        // list.InsertAtBegin(14);
        // list.display();
        // System.out.println();
        // list.display();
        list.InsertAtEnd(100); //if list khaali then null pointer exception corner case
        System.out.println();
        list.display();
    }
}
