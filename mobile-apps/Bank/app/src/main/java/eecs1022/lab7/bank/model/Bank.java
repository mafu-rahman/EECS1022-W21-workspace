package eecs1022.lab7.bank.model;

public class Bank {
    String status;
    Client[] client;
    int noc;
    boolean error;

    public Bank() {
        client = new Client[6];
        this.noc = 0;
        status = "";
        this.error = false;
        this.status = "";
    }

    /*
    Helper Methods
     */

    private boolean doesClientExist(String name) {
        boolean doesClientExist = false;

        for (int i = 0; i < this.noc; i++) {
            if (client[i].name.equals(name)) {
                doesClientExist = true;
            }
        }
        return doesClientExist;
    }

    private int getClientIndex(String name) {
        int index = 0;
        for (int i = 0; i < this.noc; i++) {
            if (client[i].name.equals(name)) {
                index = i;
            }
        }
        return index;
    }

    private boolean isamountAvailable(Client client, double amount) {
        boolean amountAvailable = false;
        if (client.balance >= amount) {
            amountAvailable = true;
        }
        return amountAvailable;
    }

    /*
    Accessors
     */

    public String getStatus() {
        if (!this.error) {
            String result = "Accounts: {";

            for (int i = 0; i < this.noc; i++) {
                if (i == this.noc-1) {
                    result += client[i].getStatus();
                }
                else {
                    result += client[i].getStatus() + ", ";
                }
            }
            result += "}";
            status = result;
        }
        this.error = false;
        return status;
    }

    public String[] getStatement(String name) {
        String result[]=null;
        if (doesClientExist(name)) {
            result = client[getClientIndex(name)].getStatement();
        }
        else {
            this.error = true;
            this.status = "Error: From-Account " + name + " does not exist";
        }
        return result;
    }


    /*
    Mutators
     */

    public void deposit(String name, double amount) {
        if (doesClientExist(name)) {
            int index = getClientIndex(name);
            if (amount > 0) {
                client[index].deposit(amount);
            }
            else {
                this.error = true;
                this.status = "Error: Non-Positive Amount";
            }
        }
        else {
            this.error = true;
            this.status = "Error: To-Account " + name + " does not exist";
        }
    }

    public void withdraw(String name, double amount) {
        if (doesClientExist(name)) {
            int index = getClientIndex(name);
            if (amount > 0) {
                if (isamountAvailable(client[index], amount)) {
                    client[index].withdraw(amount);
                }
                else {
                    this.error = true;
                    this.status = "Error: Amount too large to withdraw";
                }
            }
            else {
                this.error = true;
                this.status = "Error: Non-Positive Amount";
            }
        }
        else {
            this.error = true;
            this.status = "Error: From-Account " + name + " does not exist";
        }
    }

    public void transfer(String from, String to, double amount) {
        boolean fromExists = doesClientExist(from);
        boolean toExists = doesClientExist(to);

        if (fromExists && toExists) {
            if (amount > 0) {
                int indexFrom = getClientIndex(from);
                int indexTo = getClientIndex(to);
                if (isamountAvailable(client[indexFrom], amount)) {
                    client[indexFrom].withdraw(amount);
                    client[indexTo].deposit(amount);
                }
                else {
                    this.error = true;
                    this.status = "Error: Amount too large to transfer";
                }
            }
            else {
                this.error = true;
                this.status = "Error: Non-Positive Amount";
            }
        }
        else if (!fromExists) {
            this.error = true;
            this.status = "Error: From-Account " + from + " does not exist";
        }
        else if (!toExists) {
            this.error = true;
            this.status = "Error: To-Account " + to + " does not exist";
        }
    }

    public void addClient(String name, double amount){
        if (this.noc == 6){
            this.error = true;
            this.status = "Error: Maximum Number of Accounts Reached";
        }
        else if (doesClientExist(name)){
            this.error = true;
            this.status = "Error: Client " + name +" already exists";
        }
        else if (amount<=0){
            this.error = true;
            this.status = "Error: Non-Positive Initial Balance";
        }
        else{
            client[this.noc] = new Client(name, amount);
            this.noc++;
        }
    }
}
