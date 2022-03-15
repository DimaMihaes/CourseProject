package lesson15homework.secondtask;

public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.month = validateMonth(month) ? month : 0;
        this.day = validateDay(day) ? day : 0;
        this.year = validateYear(year) ? year : 0;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = validateDay(day) ? day : 0;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = validateMonth(month) ? month : 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = validateMonth(year) ? year : 0;
    }

    public void displayDate() {
        if (day == 0 || month == 0) {
            System.out.println("The date or month is incorrectly");
        } else {
            System.out.println("The date is: "+ day + "." + month + "." + year);
        }
    }


    private boolean validateMonth(int month) {
        return month >= 1 && month <= 12;

    }


    public boolean validateDay(int day) {


        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day >= 1 && day <= 31;
            case 2:
                return day >= 1 && day <= 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return day >= 1 && day < 30;
            default:
                return false;

        }
    }

    public boolean validateYear(int year) {
        return year > 0;

    }
}

