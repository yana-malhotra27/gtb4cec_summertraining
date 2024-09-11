package Week8;

 class Ash {
    int d=12;
    Ash(int d){
        this.d=d;
    }
}
class Bash extends Ash { //error if parent as constructor then child class should call it
    int a=12;
    Bash(int d){
        super(d); //reference variable
    }
}
public class Main{
    public static void main(String[] args) {
        Bash obj=new Bash(30);
        System.out.println(obj.d);
    }
}