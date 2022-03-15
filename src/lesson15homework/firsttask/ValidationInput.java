package lesson15homework.firsttask;

import java.util.Scanner;

public class ValidationInput {
    Scanner scanner;

    public ValidationInput() {

        scanner = new Scanner(System.in);

    }

    public int inputInt() {
        int intInput = scanner.nextInt();
        while (intInput < 0) {
            System.out.println("The input is incorrect. ");
            intInput = scanner.nextInt();

        }
        scanner.nextLine();
        return intInput;

    }

    public double inputDouble() {

        double doubleInput = scanner.nextDouble();
        while (doubleInput < 0) {

            System.out.println("The input is incorrect");
            doubleInput = scanner.nextDouble();
        }
        scanner.nextLine();
        return doubleInput;
    }

    public int inputForInt() {
        int intInput = scanner.nextInt();
        while (intInput < 0) {

            intInput = scanner.nextInt();
            return intInput = 0;

        }
        scanner.nextLine();
        return intInput;
    }
}




