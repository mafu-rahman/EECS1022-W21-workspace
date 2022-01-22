package eecs1022.lab7.bank.model;

public class Transaction {
    String type;
    double amount;

    public Transaction(String type, double amount){
        this.type = type;
        this.amount=amount;
    }

    public String getStatus(){
        String result="";
        if (this.type.equals("DEPOSIT")){
            result = "Transaction DEPOSIT: $" + String.format("%.2f" , this.amount);
        }
        else if(this.type.equals("WITHDRAW")){
            result = "Transaction WITHDRAW: $" + String.format("%.2f" , this.amount);
        }
        return result;
    }
}
