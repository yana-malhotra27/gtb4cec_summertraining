package Week8;

public class Client {
    public static void main(String[] args) {
        //Account obj=new Account("Vishal", 123, 4321);
        //System.out.println(obj.Balance); //error
        // System.out.println(obj.getBalance(4321));
        // System.out.println(obj.getBalance(123)); //wrong pin return null
         B obj=new B();
        // System.out.println(obj.a);
        // Engine e=new Engine(12,13);
        // Car Maruti=new Car(e);
        // Car BMW=new Car(e);
        obj.sum(12,13);
        obj.sum(12,13.0);
        obj.fun();
    }
}