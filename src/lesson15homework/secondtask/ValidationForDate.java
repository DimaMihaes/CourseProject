package lesson15homework.secondtask;

public class ValidationForDate {
    private int day;
    private int month;
    private int year;

    public void displayDate(){
        if( day == 0 || month == 0){
            System.out.println("The day or month is incorrectly ");
        }
        else {
            System.out.println(day+"/"+month+"/"+year);
        }
    }



    private boolean validateMonth(int month) {
        return month >= 1 && month <= 12;

    }


    public boolean validateDay(int day) {
        boolean a = false;
        boolean b;
        switch (month) {

            case 1: return day >= 1 && day <= 31;
            case 3: return day >= 1 && day <= 31;
            case 5: return day >= 1 && day <= 31;
            case 7: return day >= 1 && day <= 31;
            case 8: return day >= 1 && day <= 31;
            case 10: return day >= 1 && day <= 31;
            case 12: return day >= 1 && day <= 31;


            case 2 : return day >= 1 && day <= 28;

            case 4 : return day >= 1 && day < 30;
            case 6 : return day >= 1 && day < 30;
            case 9 : return day >= 1 && day < 30;
            case 11 : return day >= 1 && day < 30;
            default: return false;

        }
    }

    public boolean validateYear(int year) {
        return year > 0;


        }

        }







