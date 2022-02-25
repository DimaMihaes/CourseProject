package lesson12homework;

import java.util.Scanner;

public class ParkingTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ParkingCharges client = new ParkingCharges();

        System.out.println("Hello\n");
        System.out.print("How many hours have you been parked?: ");
        int hours = scanner.nextInt();

        client.setParkingHours(hours);
        client.calculatePrice();
        System.out.println("Price for parking is: " + client.getParkingPrice());
    }


}

