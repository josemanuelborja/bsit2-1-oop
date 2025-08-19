public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");

        BankAccount account1 = new BankAccount("Cabalde", 1000);
        BankAccount account2 = new BankAccount("Johnden", 2500);
        BankAccount account3 = new BankAccount("Ashton", 500);

        System.out.println("\n═══ Account Operations ═══");
        account1.deposit(500);
        account2.withdraw(300);

        System.out.println("\n═══ Interest Calculation ═══");
        System.out.println("Cabalde's interest: $" + account1.calculateInterest());
        System.out.println("Johnden's interest: $" + account2.calculateInterest());
        System.out.println("Ashton's interest: $" + account3.calculateInterest());

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}