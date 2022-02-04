package lesson4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main (String[] args) {
             double pret ;
             double tax;
             double total;

        System.out.print("Introduceti pretul:" );
        Scanner a=new Scanner(System.in);
         pret = a.nextDouble() ;


        System.out.print("Introduceti taxa:" );
        tax= a.nextDouble() ;


        System.out.print("Introduceti cantitatea: ");
        int quantity = a.nextInt();

        a.close();

        total= pret * tax * quantity ;
        System.out.println("Total cost with tax is: " +total);


    }
}
