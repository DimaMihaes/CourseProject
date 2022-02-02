package lesson4;

public class MinutesConverter {
    public static void main (String[] args){
        long minutes = 525948L ;
        double days = minutes / 1440;
        double years = days / 365;
        System.out.println("Minute in zile: "+days);
        System.out.println("Minute in ani: "+years);

    }

}
