package Week7;

public class Bank {
    int bankBalance;
    String name;
    int acno;
    void Deposit(int amount){
        bankBalance=amount+bankBalance;
    }
    void Withdraw(int amount){
        if(bankBalance==0){
            return; //conditional return
        }
        bankBalance=bankBalance-amount;
    }
}
