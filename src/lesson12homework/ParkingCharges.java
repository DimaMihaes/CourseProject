package lesson12homework;

public class ParkingCharges {
    private final double minCost = 2.0;
    private final double additionalCost = 0.5;
    public final double maxCost = 10.0;
    private int parkingHours;
    private double parkingPrice;

    public void setParkingHours(int parkingHours) {
        this.parkingHours = parkingHours;

    }

    public double getParkingPrice() {
        return parkingPrice;
    }

    public void calculatePrice() {

        if (parkingHours > 19) {
            parkingPrice = maxCost;
        } else if (parkingHours <= 3 && parkingHours > 0) {
            parkingPrice = minCost;
        } else if (parkingHours > 3 || parkingHours == 19) {

            parkingPrice = additionalCost * parkingHours + 0.5;
        } else {
            System.out.println("The number of hours entered is wrong");

        }

    }
}


