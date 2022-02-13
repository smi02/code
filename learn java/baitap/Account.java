package baitap;
public class Account {
    private int idAccount;
    private Customer cus;
    private double balance=0;

    public Account() {
    }

    public Account(int idAccount, Customer cus) {
        this.idAccount = idAccount;
        this.cus = cus;
    }

    public Account(int idAccount, Customer customer, double balance){
        this.idAccount = idAccount;
        this.cus = customer;
        this.balance = balance;
    }
 
    public int getIdAccount() {
        return idAccount;
    }
 
    public Customer getCustomer() {
        return cus;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    public String getCustomerName(){
        return cus.getName();
    }
    
    // Hàm bỏ tiền vào tài khoản
    public Account deposit(double amount) {
        balance = balance + amount;
        Account temp = new Account(idAccount, cus, balance);
        return temp;
    }
 
    public Account withdraw(double amount){
        Account temp = null;
        if(balance >= amount) {
            balance = balance - amount;
            temp = new Account(idAccount, cus, balance);
        } else {
            System.out.println("amount widthdrawn");
        }
        return temp;
    }
 
    @Override
    public String toString() {
        return "Account{" +
                "idAccount=" + idAccount +
                ", customer=" + cus.toString() +
                ", balance=" + balance +
                '}';
    }
 }
 

