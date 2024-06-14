package day07.Step3;

public class Account {
    private int balance;
    private String number;

    public Account(){}
    public Account(int balance, String number){
        this.balance = balance;
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
