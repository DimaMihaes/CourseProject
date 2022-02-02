package lesson4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main (String[] args) {

        System.out.print("Introduceti pretul: ");
        Scanner a=new Scanner(System.in);
        double pret = a.nextDouble() ;


        System.out.print("Introduceti taxa:" );
        double tax= a.nextDouble() ;


        System.out.print("Introduceti cantitatea: ");
        int quantity = a.nextInt();

        a.close();

        double total ;
        total= pret * tax * quantity ;
        System.out.println("Total cost with tax is: " +total);


    }
}
