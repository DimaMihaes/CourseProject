package lesson15homework.firsttask;


public class Init {

    public static Invoice[] initProduct() {
        Invoice product1 = new Invoice("Samsung", "Mobile", 3, 400);
        Invoice product2 = new Invoice("AppleWatch", "Watch", 4, 300);
        Invoice product3 = new Invoice("Asus", "Laptop", 5, 400);
        return new Invoice[]{product1, product2, product3};


    }

    private Invoice[] invoices;

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }


    public void printProducts() {
        for (Invoice invoice : this.invoices) {
            System.out.println(invoice.toString());
            System.out.println("Amount is : " + invoice.getAmount());


        }

    }

}
