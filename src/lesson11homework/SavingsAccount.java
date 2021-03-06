package lesson11homework;

public class SavingsAccount {

    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
        annualInterestRate = 0.0;
        savingsBalance = 0.0;

    }

    public SavingsAccount(double intRate, double savBal) {
        annualInterestRate = intRate;
        savingsBalance = savBal;

    }

    public double calculateMonthlyInterest() {
        double intRate = (savingsBalance * annualInterestRate / 12);
        savingsBalance += intRate;
        return intRate;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public void setSavingsBalance(double newBal) {
        savingsBalance = newBal;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
