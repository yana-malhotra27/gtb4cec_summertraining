package Week7;

public class Ac {
    //description
    //State
    boolean Start;
    int temp;
    String swing;
    int fanSpeed;
    Ac(){ //non parametrised
        //default constructor
    }
    Ac(boolean val1,int val2,String val3,int val4){ //pramaterised
        //constructor
        Start=val1;
        temp=val2;
        swing=val3;
        fanSpeed=val4;
    }
    //Behaviour
    void SwitchMode(){
        if(Start=true){
            Start=false;
        }else{
            Start=true;
        }
    }
    void Increase(){
        if(temp==30){
            return; //conditional return
        }
        temp++;
    }
    void Decrease(){
        if(temp==16){
            return; //conditional return
        }
        temp--;
    }
}