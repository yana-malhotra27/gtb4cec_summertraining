package Week9;

public class LinkedList {
//array-continous ds
//stack-continous ds
//queue-continous ds
//hashmap-continous ds
//stack-execution of program
//heap-storage
//dynamic array
//linked list-discontinous
//discontinous memory allocation-saves space, paging/segmentation (operating system)
//bigo(n)
//12 oct exams
    class Node{
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item){
        Node nn=new Node();
        nn.data=item;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
    }
    public void display(){
        //n time complexity
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public int size(){
        return size;
    }
    public void addLast(int item){
        //big o(1)
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    //function to get a node
    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addAtIndex(int item,int index){
        if(index==0){
            addFirst(item);
        }
        else if(index==size){
            addLast(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            Node k_th=getNode(index-1);
            nn.next=k_th.next;
            k_th.next=nn;
            size++;
        }
    }
    public int getStart(){
        return head.data;
    }
    public int getEnd(){
        return tail.data;
    }
    public int getIndex(int index){
        if(index==0){
            return getStart();
        }
        else if(index==size-1){
            return getEnd();
        }
        else{
            return getNode(index).data;
        }
    }
    //remove from start
    public int removeFirst(){
        int rn=head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rn;
    }
    //remove from last
    public int removeEnd(){
        if(size==1){
            return removeFirst();
        }
        else{
            int rn=tail.data;
            Node sl=getNode(size-2);
            sl.next=null;
            tail=sl;
            size--;
            return rn;
        }
    }
    //remove kth element
    public int remove(int index){
        if(index==0){
            return removeFirst();
        }
        else if(index==size-1){
            return removeEnd();
        }
        else{
            Node first=getNode(index-1);
            Node temp=first.next;
            first.next=temp.next;
            temp.next=null;
            size--;
            return temp.data;
        }

    }

}