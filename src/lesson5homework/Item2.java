package lesson5homework;
import java.util.Scanner;

public class Item2 {
    public static void main (String[] args){

        int lung , lat , lung2 ,lat2 , aria1 , aria2;

        System.out.print("Introduceti latimea si lungimea primului dreptunghi: ");
        Scanner a = new Scanner(System.in);
        lung = a.nextInt();
        lat = a.nextInt();
        aria1 = lung * lat ;
        System.out.println( "Aria primului dreptunghi: " +aria1);

        System.out.print("Introduceti latimea si lungimea al doilea dreptunghi: ");
        lung2 = a.nextInt();
        lat2 = a.nextInt();
        aria2 = lung2 * lat2 ;
        System.out.println( "Aria la al doilea  dreptunghi: " +aria2);

        if (aria1 > aria2 ) {
            System.out.println("Primul dreptunghi estea mai mare ");
        }

        else if (aria1 == aria2 ) {
            System.out.println("Drepunghiurile sunt egale ");
        }
        else {
            System.out.println("Al doilea dreptunghi este mai mare ");
        }
        a.close();

    }

}
