package lesson6homework;

import java.util.Scanner;

public class SimplifyTheFollowing {
    public static void main(String[] args) {

        int temperature;
        int maxTemp;
        int minTemp;

        Scanner a = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temperature = a.nextInt();

        System.out.print("Enter maximum temperature: ");
        maxTemp = a.nextInt();

        System.out.print("Enter minimum temperature: ");
        minTemp = a.nextInt();

        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else {
            if (temperature < minTemp) {
                System.out.println("Porridge is too cold.");
            } else {
                System.out.println("Porridge is just right.");
            }
        }
        a.close();

    }
}
