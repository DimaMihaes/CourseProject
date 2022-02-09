package lesson7homework;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num, reverse = 0;


        System.out.print("Insert number: ");
        num = a.nextInt();


        if (num <= 0) {
            System.out.println("Invalid number");

        } else {
            while (num > 0) {

                reverse = reverse * 10 + num % 10;
                num = num / 10;

            }
            System.out.println(+reverse);
        }

    }
}