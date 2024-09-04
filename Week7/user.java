package Week7;

public class user {
    public static void main(String[] args) {
        Bank SBI=new Bank();
        SBI.bankBalance=1000000000;
        System.out.println(SBI.bankBalance);
        SBI.Withdraw(9);
        System.out.println(SBI.bankBalance);
    }
}