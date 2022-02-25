package lesson12homework;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        boolean prim = number >= 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prim = false;
                break;
            }
        }
        return prim;
    }

    public static int getPrimeNumbers(int start, int end) {
        int primeNum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNum++;
            }
        }
        return primeNum;
    }


    public static void main(String[] args) {

        int primeNum = PrimeNumber.getPrimeNumbers(0, 10000);
        System.out.println("Int this intervals is " + primeNum + " prime numbers");

    }
}
