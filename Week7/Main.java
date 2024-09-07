package Week7;
//access-visibility change
//non-access-characteristics change
//public- access everywhere
//private- access within class
//default-no keyword required, visible only in same package
//keyword final-making value of variable as constant u can't change it
//static variable-created in class area/method also accessible by class name and object name
//types of variable
//local variable-function
//object variable-class
//class variable-class keyword static (static-class oriented variable)
//  from Inside the  Static function, we can only access Static members (function and Varibles).
// from Inside the  Static function, we cann't access Non Static members( Object oriented function and Varible )
//non static fn- we can access both static and non-static
class Amodifier { //public class Amodifier
    //state
    //public int val;
    //private int val;
    int val; //object variable //non-static variable //instance variable all same
    //final int val2=13;
    int val2;
    static int a=20; //class variable
    //int a=12; //error //object variable //compilation error
    //final int val2; //object variable
    public Amodifier(){
        val=12;
        //val2=14; //give error
        val2=14;
    }
    public int get() { //getters and setters fn to access private mode (encapsulation)
        //return val;
        return this.val;
    }
    public static void fun(){ //static fn
        //System.out.println(a);
        //System.out.println(val); //object variable error
    }
}
public class Main{
    public static void main(String[] args) {
        Amodifier obj=new Amodifier();
        //System.out.println(Amodifier.val);
        // Amodifier.fun();
        // obj.fun();
        //obj.get();
    }
}