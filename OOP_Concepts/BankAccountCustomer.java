class Customer {
    private String name;
    private String phone;
    
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        System.out.println("Customer created: " + name);
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhone() {
        return phone;
    }
}

public class BankAccountCustomer {
    private String accountNumber;
    private double balance;
    private Customer customer;
    
    public BankAccountCustomer(String accountNumber, String customerName, String phone) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.customer = new Customer(customerName, phone); // Customer created immediately
    }
    
    public void display() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Balance: $" + balance);
    }
    
    public static void main(String[] args) {
        BankAccountCustomer account = new BankAccountCustomer("12345", "John Doe", "123-456-7890");
        account.display();
    }
}