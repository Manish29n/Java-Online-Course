package academy.learnprogramming;

public class VipCustomer {
    private final String name;
    private final long creditLimit;
    private final String emailAddress;

    public VipCustomer(String name, long creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, long creditLimit) {
        this(name, creditLimit, "manish29na@gmail.com");
        System.out.println("Constructor with two parameters called");
    }

    public VipCustomer() {
        this("Manish",1234567,"me@gmail.com");
        System.out.println("Empty constructor called");
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
