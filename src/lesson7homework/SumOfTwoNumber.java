package lesson7homework;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {

        int sum, num1, num2;
        char answer;
        Scanner a = new Scanner(System.in);
        do {
            System.out.print("Insert two number: ");
            num1 = a.nextInt();
            num2 = a.nextInt();
            sum = num1 + num2;
            System.out.println("Do you want to perform the operation again? Y-yes , other - no");
            answer = a.next().charAt(0);

        } while (answer == 'Y' || answer == 'y');
        System.out.println("Sum is: " + sum);
        a.close();


    }

}
