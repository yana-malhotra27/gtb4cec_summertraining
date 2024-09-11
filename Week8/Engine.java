package Week8;

public class Engine {

    int average;
    int power;
    Engine(int average,int power){
        this.average=average;
        this.power=power;
    }
    public void startEngine(){
        System.out.println("Engine is start");
    }
    public void offEngine(){
        System.out.println("Engine is off");
    }
}
