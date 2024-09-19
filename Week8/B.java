package Week8;

public class B extends A{ //inheritance b-->a in c++ we use colon : and A also inherited object class is a relationship
    int a=100;
    public void fun2(){
        System.out.println("fun2 is called");
    }
    //method overiding
    @Override //define new definations
    public void fun(){
        System.out.println("fun of B is called");
        super.fun(); //only in constructor suyper is up stores address of parent object
    }
    //method overloading
    public void sum(int a,int b){ //overloading
        System.out.println("int sum is called");
        System.out.println(a+b);
    }
    public void sum(double a,double b){ //overloading type diff
        System.out.println("double is called");
        System.out.println(a+b);
    }
    public void sum(double a,int b){ //overloading order diff
        System.out.println("double int");
        System.out.println(a+b);
    }
    public void sum(int a,double b){ //overloading order diff
        System.out.println("double int");
        System.out.println(a+b);
    }
    public void sum(double a,int b,int c){ //overloading no. of para diff
        System.out.println("double int int");
        System.out.println(a+b+c);
    }
}