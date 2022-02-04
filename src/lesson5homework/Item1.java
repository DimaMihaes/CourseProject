package lesson5homework;
import java.util.Scanner ;


public class Item1 {

        public static void main (String[] args){

            int number ;

        System.out.print("Insert number : ");
        Scanner a = new Scanner(System.in);
        number = a.nextInt();

        if ( number %2 == 0)
            System.out.println("Number is odd");

        else
            System.out.println("Number is even");

        a.close();
    }
}
