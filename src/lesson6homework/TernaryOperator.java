package lesson6homework;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        System.out.print("Number of color: ");
        Scanner a = new Scanner(System.in);

        int colorCode;
        colorCode = a.nextInt();
        String color = null;

        color = (colorCode == 100) ? "Yellow" : ((colorCode == 101) ? "Green"
                : ((colorCode == 102) ? "Red" : ((colorCode == 103) ? "Blue": "Invalid")));

        System.out.println("Your color is " + color);

        a.close();


    }
}




