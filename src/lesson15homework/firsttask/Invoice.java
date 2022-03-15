package lesson15homework.firsttask;

public class Invoice {

    private String deviceModel;
    private String productDescription;
    private int quantity;
    private double price;
    ValidationInput validationInput = new ValidationInput();

    public Invoice(String deviceModel, String productDescription, int quantity, double price) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = validationInput.inputForInt();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = validationInput.inputDouble();
    }

    public double getAmount() {
        return quantity * price;
    }

    public void info() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "{" +
                "deviceModel='" + deviceModel + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

