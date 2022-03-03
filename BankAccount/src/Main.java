public class Main {
    public static void main(String[] args) {
        BankAccount AB01 = new BankAccount();

        AB01.setCustomerName("Abhishek Chandra");
        AB01.setAccountNumber("2872");
        AB01.setBalance(1000);
        AB01.setEmail("1ac23456789@gmail.com");
        AB01.setPhoneNumber("8750074055");

        System.out.println("Account Details:" +
                "\nCustomer Name: " + AB01.getCustomerName() +
                "\nAccount Number: " + AB01.getAccountNumber() +
                "\nBalance: " + AB01.getBalance() +
                "\nEmail: " + AB01.getEmail() +
                "\nPhone Number: " + AB01.getPhoneNumber());

        AB01.depositFunds(1000);
        System.out.println("Account Details:" +
                "\nCustomer Name: " + AB01.getCustomerName() +
                "\nAccount Number: " + AB01.getAccountNumber() +
                "\nBalance: " + AB01.getBalance() +
                "\nEmail: " + AB01.getEmail() +
                "\nPhone Number: " + AB01.getPhoneNumber());
        AB01.withdrawalFunds(10000);
        System.out.println("Account Details:" +
                "\nCustomer Name: " + AB01.getCustomerName() +
                "\nAccount Number: " + AB01.getAccountNumber() +
                "\nBalance: " + AB01.getBalance() +
                "\nEmail: " + AB01.getEmail() +
                "\nPhone Number: " + AB01.getPhoneNumber());
        AB01.withdrawalFunds(1000);
        System.out.println("Account Details:" +
                "\nCustomer Name: " + AB01.getCustomerName() +
                "\nAccount Number: " + AB01.getAccountNumber() +
                "\nBalance: " + AB01.getBalance() +
                "\nEmail: " + AB01.getEmail() +
                "\nPhone Number: " + AB01.getPhoneNumber());
    }
}
