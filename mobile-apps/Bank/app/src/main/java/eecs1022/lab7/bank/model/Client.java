package eecs1022.lab7.bank.model;

public class Client {

    String name;
    double balance;
    Transaction transaction[];
    int not;

    public Client(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.not = 0;
        transaction = new Transaction[10];
    }

    /*
    Accessors
     */

    public String getStatus(){
        String result = this.name + ": $" + String.format("%.2f" , this.balance);
        return result;
    }

    public String[] getStatement(){
        String[] result = new String[this.not+1];
        result[0] = getStatus();
        int j = 1;
        for(int i=0; i<this.not; i++){
            result[j] = transaction[i].getStatus();
            j++;
        }
        return result;
    }

    /*
    Mutators
     */

    public void deposit(double amount){
        transaction[this.not] = new Transaction("DEPOSIT", amount);
        this.not++;
        this.balance += amount;
    }

    public void withdraw(double amount){
        transaction[this.not] = new Transaction("WITHDRAW", amount);
        this.not++;
        this.balance -= amount;
    }
}
