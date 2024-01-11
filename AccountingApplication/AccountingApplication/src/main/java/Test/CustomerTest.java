package Test;

import Template.Customer;

public class CustomerTest {
    public static void testCustomerClass() {
        Customer customer = new Customer();

        customer.setCustomerID();
        System.out.println("Customer ID : " + customer.getCustomerID());
    }
}
