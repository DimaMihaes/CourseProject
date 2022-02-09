package lesson7homework;


public class DivisibleNumber {
    public static void main(String[] args) {

        System.out.print("Number which are divisible by 5 and 6: ");

        for (int num = 100; num <= 1000; num++) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(" " + num);
            }
        }
    }
}
