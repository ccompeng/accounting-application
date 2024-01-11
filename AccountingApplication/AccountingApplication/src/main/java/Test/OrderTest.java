package Test;

import Template.Order;
import Template.Product;

public class OrderTest {
    public static void testOrderClass() {
        Order order = new Order();
        Product product = new Product();
        product.setProductID();
        product.setPrice(78500.55f);

        order.setOrderID();
        System.out.println("Order ID : " + order.getOrderID());

        order.setOrderDate("30.12.2023");
        System.out.println("Date ordered : " + order.getOrderDate());

        order.setProducts(product);
        System.out.println("Products in order : " + order.getProducts().getFirst());

        order.setTotalAmount();
        System.out.println("Total amount of order : " + order.getTotalAmount());
    }
}
