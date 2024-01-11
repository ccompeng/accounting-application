package Test;

import Template.Customer;
import Template.MoneySafe;
import Template.Order;
import Template.Product;

public class MoneySafeTest {
    public static void testMoneySafeClass() {
        MoneySafe ms = new MoneySafe();

        Customer c = new Customer("dfghjk");
        Product p = new Product("hbgtr6", 5400.0f, 4000.0f, 8, "phone.jpg");

        Order order = new Order("234red", c, 52000.0f, "30.12.2023");
        order.setProducts(p);

        ms.setTotalMoney(order);
        System.out.println("Total money : " + ms.getTotalMoney());

        ms.setPayment();
        System.out.println("Payment : " + ms.getPayment());

        ms.setTotalCost();
        System.out.println("Total cost : " + ms.getTotalCost());

        ms.setTotalTax();
        System.out.println("Total tax : " + ms.getTotalTax());

        ms.setLeftMoney();
        System.out.println("Left money : " + ms.getLeftMoney());
    }
}
