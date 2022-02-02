package lesson4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main (String[] args) {

        System.out.println("Introduceti pretul: ");
        Scanner a=new Scanner(System.in);
        double pret = a.nextDouble() ;


        System.out.println("Introduceti taxa:" );
        Scanner b=new Scanner(System.in);
        double tax= b.nextDouble() ;


        System.out.println("Introduceti cantitatea: ");
        Scanner c=new Scanner(System.in);
        int quantity = c.nextInt();

        a.close();
        b.close();
        c.close();

        double total ;
        total= pret * tax * quantity ;
        System.out.println("Total cost with tax is: " +total);


    }
}
