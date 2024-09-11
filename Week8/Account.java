package Week8;

public class Account {
    //should add access modifier
    public String AccountHolder;
    public int AccountNumber;
    private int Balance; //hide and also give getters and setters to give access
    private int pinNumber;
    //rightclick source action generate getters and setters only private ones
    public Integer getBalance(int pinNumber) {
        if(this.pinNumber==pinNumber){
            return Balance;
        }
        else{
            return null;
        }
    }

    public void setBalance(int amount,int pinNumber) {
        if(this.pinNumber==pinNumber && (Balance-amount)>=0){
            Balance-=amount;
        }else{
            System.out.println("hey stahp it!");
        }
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    Account(String AccountHolder,int AccountNumber,int pinNumber){
        this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;
        this.pinNumber=pinNumber;
    }
}
