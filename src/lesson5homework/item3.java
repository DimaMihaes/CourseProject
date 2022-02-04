package lesson5homework;
import java.util.Scanner;

public class item3 {
    public static void main (String[] args) {

        float number;

        System.out.print("Introduceti numarul: ");
        Scanner a=new Scanner(System.in);
        number = a.nextFloat();

        if (number > 0 && number <1)
            System.out.println("Numarul este mic , pozitiv");
        else if (number > 1000000)
            System.out.println("Numarul este mare , pozitiv.");
        else if (number >=1 && number <= 1000000)
            System.out.println("Numarul este pozitiv");
        else if (number <0 )
            System.out.println("Numarul este negativ");
        else
            System.out.println("Numarul este zero");

        a.close();

    }
}
