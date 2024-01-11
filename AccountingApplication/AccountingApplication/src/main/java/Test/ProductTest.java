package Test;

import Template.Product;

public class ProductTest {
    public static void testProductClass() {
        Product product = new Product();

        product.setProductID();
        System.out.println("Product ID : " + product.getProductID());

        product.setPrice(9000.65f);
        System.out.println("Product price : " + product.getPrice());
        System.out.println("Product format price : " + product.formatPrice());

        product.setCost(3000.0f);
        System.out.println("Product cost : " + product.getCost());
        System.out.println("Product format cost : " + product.formatCost());

        product.setStock(12);
        System.out.println("Stock : " + product.getStock());

        System.out.println("Product tax : " + product.getTaxAmount());
        System.out.println("Product format tax : " + product.formatTaxAmount());

        System.out.println("Earning : " + product.getEarning());
        System.out.println("Format earning : " + product.formatEarning());

        product.setImageFile("phone.jpg");
        System.out.println("Product image file : " + product.getImageFile());
    }
}
