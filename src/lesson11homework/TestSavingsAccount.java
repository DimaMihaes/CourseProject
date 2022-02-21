package lesson11homework;

public class TestSavingsAccount {
    public static void main(String[] args) {

        SavingsAccount account1 = new SavingsAccount();
        SavingsAccount account2 = new SavingsAccount();
        account1.setSavingsBalance(2000.00);
        account2.setSavingsBalance(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.println("New balance for first account(rate 4%) = " + account1.getSavingsBalance());
        System.out.println("New balance for second account(rate 4%) = " + account2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.println("New balance for first account(rate 5%) = " + account1.getSavingsBalance());
        System.out.println("New balance for second account(rate 5%) = " + account2.getSavingsBalance());


    }
}
