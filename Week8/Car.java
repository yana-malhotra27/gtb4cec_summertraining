package Week8;

public class Car {
    Engine e; //make bucket of other class for has a relationship
    Car(Engine e){
        this.e=e; //and initialize in constructor
        e.startEngine();
    }
    
}