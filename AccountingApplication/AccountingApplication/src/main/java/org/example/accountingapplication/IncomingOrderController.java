package org.example.accountingapplication;

import Template.Order;
import Template.Product;
import Template.Data;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class IncomingOrderController implements Initializable {
    @FXML private Label orderIDLabel;
    @FXML private Label customerIDLabel;
    @FXML private Label totalAmountLabel;
    @FXML private Label productsLabel;
    @FXML private Label orderIDDescLabel;
    @FXML private Label customerIDDescLabel;
    @FXML private Label totalAmountDescLabel;
    @FXML private ImageView productImage1;
    @FXML private ImageView productImage2;
    @FXML private ImageView productImage3;
    @FXML private Label productPriceLabel1;
    @FXML private Label productPriceLabel2;
    @FXML private Label productPriceLabel3;
    @FXML private Label textLabel;

    private final LocalDate dateObj = LocalDate.now();
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyy");
    private final String dateFormat = dateObj.format(dateTimeFormatter);

    private static final ArrayList<Label> productPriceLabels = new ArrayList<>();
    private static final ArrayList<ImageView> productImages = new ArrayList<>();

    @FXML
    public void refreshPane() {
        int randomOrderBoolVal;

        randomOrderBoolVal = (int) (Math.random() * 2);

        if (randomOrderBoolVal == 0) {
            orderIDLabel.setVisible(false);
            orderIDDescLabel.setVisible(false);
            customerIDLabel.setVisible(false);
            customerIDDescLabel.setVisible(false);
            totalAmountLabel.setVisible(false);
            totalAmountDescLabel.setVisible(false);
            productsLabel.setVisible(false);
            productPriceLabel1.setVisible(false);
            productPriceLabel2.setVisible(false);
            productPriceLabel3.setVisible(false);
            productImage1.setVisible(false);
            productImage2.setVisible(false);
            productImage3.setVisible(false);

            textLabel.setVisible(true);
            textLabel.setText("Sipariş bulunamadı");
        } else {
            textLabel.setVisible(false);

            int randomProductNumberVal;
            randomProductNumberVal = (int) (Math.random() * 3) + 1;

            Order order = new Order();

            Data.setCustomers();
            Data.setProducts();

            order.setOrderID();
            order.setCustomerID(Data.getCustomer());

            for (int i = 0; i < randomProductNumberVal; i++) {
                int randomProduct = (int) (Math.random() * 8);
                Product product = Data.getProduct(randomProduct);

                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(product.getImageFile())));

                productPriceLabels.get(i).setVisible(true);
                productPriceLabels.get(i).setText(product.formatPrice());
                productImages.get(i).setVisible(true);
                productImages.get(i).setImage(image);

                order.setProducts(product);
                product.setStock(1);
            }

            productsLabel.setVisible(true);

            order.setTotalAmount();
            order.setOrderDate(dateFormat);

            Data.setOrders(order);

            orderIDLabel.setVisible(true);
            orderIDDescLabel.setVisible(true);
            orderIDDescLabel.setText(order.getOrderID());
            customerIDLabel.setVisible(true);
            customerIDDescLabel.setVisible(true);
            customerIDDescLabel.setText(order.getCustomerID());
            totalAmountLabel.setVisible(true);
            totalAmountDescLabel.setVisible(true);
            totalAmountDescLabel.setText(order.formatTotalAmount());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (productPriceLabels.isEmpty()) {
            productPriceLabels.add(productPriceLabel1);
            productPriceLabels.add(productPriceLabel2);
            productPriceLabels.add(productPriceLabel3);
        }

        if (productImages.isEmpty()) {
            productImages.add(productImage1);
            productImages.add(productImage2);
            productImages.add(productImage3);
        }

        orderIDLabel.setVisible(false);
        customerIDLabel.setVisible(false);
        totalAmountLabel.setVisible(false);
        productsLabel.setVisible(false);
    }
}
