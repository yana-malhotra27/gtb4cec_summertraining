package Week8;
//normal flow code-agar linked list bani ho to kaise banegi
//alternative flow-agar nahi bani to kya change
public class MyLinkedList {
    private Node head=null;
    public void InsertAtBegin(int val){
        Node n1=new Node(val);
        n1.next=head;
        head=n1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void InsertAtEnd(int val){
        if(head==null){
            InsertAtBegin(val);
            return;
        }
        Node temp=head;
        //tail node has property that is next null
        while(temp.next!=null){
            temp=temp.next;
        }
        Node n2=new Node(val);
        temp.next=n2;
    }
}