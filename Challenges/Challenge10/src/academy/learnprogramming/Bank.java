package academy.learnprogramming;

public class Bank {

    private int accountnumber;
    private int balance;
    private String CustomerName;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("56789",2050,12345,"manish@gmail","Manish");
        System.out.println("Empty constructor called");
    }

    public Bank(String phoneNumber,int balance,int accountnumber,String email,String CustomerName){
        System.out.println("Account Constructor with parameter called ");
        this.balance = balance;
        this.accountnumber = accountnumber;
        this.CustomerName = CustomerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String CustomerName, String email, String phoneNumber) {
        this(phoneNumber,100,12345,email,CustomerName);
        this.CustomerName=CustomerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void deposit(int depositAmount){
        this.balance +=depositAmount;
        System.out.println("Deposit of "+depositAmount+" made, New Balance is "+this.balance);
    }

    public void withdrawal(int withdrawalAmount){
        if(this.balance-withdrawalAmount<0){
            System.out.println("Only "+this.balance+" available Withdrawal not processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" processed, Remaining Balance is "+this.balance);
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
