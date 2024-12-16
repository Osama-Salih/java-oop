public class Account {
    private int accountNo;
    private String name;
    private float amount;

    public void insert(int a, String n, float amt) {
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }

    public void deposit(float amt) {
        this.amount+= amt;
        System.out.println(amt + "depoited");
    }

    public void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            this.amount-= amt;
            System.out.println(amt + "withdrawn");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + this.amount);
    }

    public String toString() {
        return "Account{" + "accountNo=" + this.accountNo + ", name=" + this.name + ", amount" + this.amount; 
    }

}
