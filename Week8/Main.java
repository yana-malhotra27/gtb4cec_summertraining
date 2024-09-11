package Week8;

 class Ash {
    int d=12;
    Ash(int d){
        System.out.println("this is call ash");
        this.d=d;
    }
}
class Bash extends Ash { //error if parent as constructor then child class should call it
    int a=12;
    Bash(int d,int a){
        //this.a=a; //error if called before super
        //super(a); //can only be once so error
        super(d); //reference variable always call first
        System.out.println("bash is called");
        //this.a=a;
    }
}
public class Main{
    public static void main(String[] args) {
        Bash obj=new Bash(30,40);
        System.out.println(obj.d);
    }
}