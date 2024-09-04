package Week7;

public class aclient {
    public static void swap(A obj1,A obj2){
        A temp=obj1;
        obj1=obj2;
        obj2=temp;
    }
    public static void main(String[] args) {
        // A obj1=new A(12);
        // A obj2=new A(13);
        // System.out.println("Before swap "+obj1.a+" "+obj2.a);
        // swap(obj1,obj2);
        // System.out.println("After swap "+obj1.a+" "+obj2.a);
        A obj=new A(12);
        System.out.println(obj.a);
    }
}