package Template;

import Template.Customer;
import Template.Order;
import Template.Product;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();

    static Customer customer1 = new Customer("abcd45");
    static Customer customer2 = new Customer("kluyhg");
    static Customer customer3 = new Customer("9696al");
    static Customer customer4 = new Customer("vtrg88");
    static Customer customer5 = new Customer("nb77yt");
    static Customer customer6 = new Customer("74klmn");

    static Product product1 = new Product("def990", 12450.50f, 9500.0f, 18, "assets/cam1.jpg");
    static Product product2 = new Product("caff21", 15750.50f, 10500.0f, 14, "assets/cam2.jpg");
    static Product product3 = new Product("a34ab6", 9000.75f, 6000.0f, 8, "assets/computer1.jpg");
    static Product product4 = new Product("d88ef9", 13750.50f, 9500.0f, 18, "assets/headphone1.jpg");
    static Product product5 = new Product("cdef77", 10500.0f, 7500.0f, 10, "assets/headphone2.jpg");
    static Product product6 = new Product("67ab89", 13550.50f, 10500.0f, 8, "assets/phone1.jpg");
    static Product product7 = new Product("adde43", 15000.0f, 12000.0f, 14, "assets/phone2.jpg");
    static Product product8 = new Product("55af62", 12500.0f, 9500.0f, 13, "assets/watch1.jpg");

    public ArrayList<Customer> getCustomers() { return customers; }

    public static Customer getCustomer() {
        int randomCustomer = (int) (Math.random() * 6);
        return customers.get(randomCustomer);
    }

    public static void setCustomers() {
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
    }

    public static ArrayList<Order> getOrders() { return orders; }

    public static void setOrders(Order order) { orders.add(order); }

    public static ArrayList<Product> getProducts() { return products; }

    public static void setProducts() {
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
    }

    public static Product getProduct(int index) {
        return products.get(index);
    }
}
