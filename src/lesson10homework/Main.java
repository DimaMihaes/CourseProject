package lesson10homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("The first problem ");

        Months[] months = Months.values();
        Months.printMonths(months);

        System.out.println("\n\nThe second problem ");
        System.out.println(Weekday.FRIDAY.isWeekDay());
        System.out.println(Weekday.MONDAY.isHoliday());
        System.out.println(Weekday.SUNDAY.isWeekDay());
        System.out.println(Weekday.SATURDAY.isHoliday());

        System.out.println("\nThe third problem ");

        Converter.aConverter();


    }
}
