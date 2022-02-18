package lesson10homework;

public enum Months {


    JANUARY, FEBRUARY, MARCH, APRIL,
    MAY, JUNE, JULY, AUGUST, SEPTEMBER,
    OCTOBER, NOVEMBER, DECEMBER;

    public static void printMonths(Months[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(String.valueOf(arr[i]) + " ");
        }
    }
}




