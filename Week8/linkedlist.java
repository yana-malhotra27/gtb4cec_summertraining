package Week8;

import java.util.LinkedList;

//data structure - linked list dynamic
//array-continous contagious
//linked list-collection of nodes non contagious or non - continous data structure
//node-object (object-real world entity)
//head node-jahan se linked list starting
//singly linked list-when every node knows next node
//doubly-when node knows previous and next both
//last node or object-tail node
//link,how to give name,how to shift name,behaviours
public class linkedlist {
    public static void main(String[] args) {
        //int size=(int)1e10; //10^10 //in java-around 10^6
        //int[] d=new d[size]; error because array has restriction that if it takes memory so it will take continous memory only
        Node n1=new Node(12);
        Node n2=new Node(13);
        Node n3=new Node(13);
        Node head=n1;
        Node temp=n2;
        //temp=n3; //shifting but forward
        //if galti se temp n2 kardiya but n3 ka karna tha so that's the code
        temp=n2.next; //shifting
        n1.next=n2;
        n2.next=n3;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1.next);
        System.out.println(n2.next);
    }
}