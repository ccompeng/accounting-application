package Template;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order extends AccApp {
    private String orderID;
    private String customerID;
    private ArrayList<Product> products = new ArrayList<Product>();
    private float totalAmount = 0;
    private String orderDate;

    public Order() {}

    public Order(String orderID, Customer customer, float totalAmount, String orderDate) {
        this.orderID = orderID;
        this.customerID = customer.getCustomerID();
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID() {
        this.orderID = super.generateID();
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customer) {
        this.customerID = customer.getCustomerID();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        this.products.add(product);
    }

    public float getTotalAmount() { return totalAmount; }

    public void setTotalAmount() {
        for (Product p: this.products) {
            this.totalAmount += p.getPrice();
        }
    }

    public String formatTotalAmount() { return String.format("%.2f", this.getTotalAmount()); }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
