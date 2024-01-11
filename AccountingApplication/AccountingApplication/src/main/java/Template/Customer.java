package Template;

public class Customer extends AccApp {
    private String customerID;

    public Customer() {}

    public Customer(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerID() { return customerID; }

    public void setCustomerID() {
        this.customerID = super.generateID();
    }
}
