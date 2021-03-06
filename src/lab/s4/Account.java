package lab.s4;

public class Account {
    int id;
    String name;
    double balance;

    public Account() {
    }

    public void credit(int amount){
        //double saukhinap = 0;
        if(amount >0){
            //saukhinap = balance+amount;
            setBalance(getBalance()+amount);
        }else{
            System.out.println("Nap tien that bai");
        }
    }

    public void debit(int amount){
        if(amount < getBalance() && amount>0){
            setBalance(getBalance()-amount);
        }else {
            System.out.println("Rut tien that bai");
        }
    }

    public void transerTo(Account account,int amount){
        if(amount>0&& amount<getBalance()){
            debit(amount);
            account.credit(amount);
        }else{
            System.out.println("Chuyen tien that bai");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

