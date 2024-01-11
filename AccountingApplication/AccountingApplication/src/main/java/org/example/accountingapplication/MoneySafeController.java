package org.example.accountingapplication;

import Template.AccApp;
import Template.Customer;
import Template.MoneySafe;
import Template.Order;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MoneySafeController extends AccApp implements Initializable {
    @FXML private Label totalMoneyLabel;
    @FXML private Label taxLabel;
    @FXML private Label paymentLabel;
    @FXML private Label leftMoneyLabel;

    MoneySafe ms = new MoneySafe();

    Customer c1 = new Customer("abcd45");
    Customer c2 = new Customer("9696al");
    Customer c3 = new Customer("nb77yt");
    Customer c4 = new Customer("74klmn");

    Order order1 = new Order("fdea45", c1, 42500.45f, "20.12.2023");
    Order order2 = new Order("dacc68", c2, 22500.75f, "19.12.2023");
    Order order3 = new Order("ca3678", c3, 12500.45f, "18.12.2023");
    Order order4 = new Order("2255aa", c4, 8700.65f, "18.12.2023");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ms.setTotalMoney(order1);
        ms.setTotalMoney(order2);
        ms.setTotalMoney(order3);
        ms.setTotalMoney(order4);

        ms.setTotalMoney();
        ms.setTotalCost();
        ms.setTotalTax();
        ms.setPayment();
        ms.setLeftMoney();

        String totalMoneyVar = String.valueOf(ms.formatTotalMoney());
        String taxVar = String.valueOf(ms.formatTotalTax());
        String paymentVar = String.valueOf(ms.formatPayment());
        String moneySafeVar = String.valueOf(ms.formatLeftMoney());

        totalMoneyLabel.setText(totalMoneyVar + " ₺");
        taxLabel.setText(taxVar + " ₺");
        paymentLabel.setText(paymentVar + " ₺");
        leftMoneyLabel.setText(moneySafeVar + " ₺");
    }
}
