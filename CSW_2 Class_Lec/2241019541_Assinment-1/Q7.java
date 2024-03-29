abstract class Account
{
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

class SavingsAccount extends Account 
{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount)
    {
        double interest = amount * interestRate / 100;
        setBalance(getBalance() + amount + interest);
    }

    public void withdraw(double amount)
    {
        if (getBalance() >= amount)
            setBalance(getBalance() - amount);
        else
            System.out.println("Insufficient funds for withdrawal");
    }
}

class CurrentAccount extends Account
{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit)
    {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount)
    {
        if (getBalance() - amount >= -overdraftLimit)
            setBalance(getBalance() - amount);
        else
            System.out.println("Exceeds overdraft limit");
    }
}

class BankingApplication
{
    public static void main(String[] args)
    {
        SavingsAccount SA = new SavingsAccount("AB123", 1000.0, 5.0);
        CurrentAccount CA = new CurrentAccount("CD456", 2000.0, 500.0);

        SA.deposit(500.0);
        SA.withdraw(200.0);

        CA.deposit(1000.0);
        CA.withdraw(2500.0);

        displayAccountDetails(SA);
        displayAccountDetails(CA);
    }

    private static void displayAccountDetails(Account account)
    {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println();
    }
}
