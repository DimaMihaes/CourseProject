package lesson15homework;

import lesson15homework.firsttask.Init;
import lesson15homework.firsttask.Invoice;
import lesson15homework.firsttask.ValidationInput;

import lesson15homework.secondtask.Date;


public class Main {

    public static void main(String[] args) {

        ValidationInput validationInput = new ValidationInput();
        Init init = new Init();

        init.setInvoices(Init.initProduct());


        while (true) {
            int k;
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1. First task. ");
            System.out.println("2. Second task. ");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            k = validationInput.inputInt();

            switch (k) {
                case 1:

                    init.printProducts();

                    break;

                case 2:
                    Date date = new Date(11, 3, 2022);
                    date.displayDate();


                    break;

                case 0:
                    System.out.println("Have a good day");
                    return;
                default:

                    System.out.println("Incorrect number. ");

            }


        }
    }
}
