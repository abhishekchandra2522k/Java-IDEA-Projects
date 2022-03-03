public class BankAccount {
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructor
//    public void BankAccount(String accountNumber, long balance, String customerName, String email, String phoneNumber){
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(int amount){
        this.balance += amount;
        System.out.println("Rs. " + amount + " deposited in " + this.customerName + "'s account. Available Balance: " + this.balance);
    }

    public void withdrawalFunds(int amount){
        if(this.balance < amount){
            System.out.println("Balance Insufficient to withdrawal Rs. " + amount + ". Available Balance: " + this.balance);
            return;
        }
        this.balance -= amount;
        System.out.println("Rs. " + amount + " withdrawal from your account. Available Balance: " + this.balance);
    }

}
