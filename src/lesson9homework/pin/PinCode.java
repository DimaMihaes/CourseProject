package lesson9homework.pin;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {


        final int pin = 1234;

        for (int passAttempts = 0; passAttempts < 3; passAttempts++) {
            System.out.print("\nEnter pin: ");
            Scanner input = new Scanner(System.in);
            int inputPass = input.nextInt();

            if (!(inputPass == pin)) {
                if (passAttempts == 2) {
                    System.out.println("Sorry but you have been locked out");

                } else
                    System.out.println("\nWrong pin ");

            } else {
                System.out.println("\nCorrect pin!");
                break;

            }

        }

    }
}
