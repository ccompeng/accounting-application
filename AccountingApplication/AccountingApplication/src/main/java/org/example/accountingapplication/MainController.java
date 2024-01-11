package org.example.accountingapplication;

import Template.AccApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController extends AccApp implements Initializable{
    @FXML private BorderPane borderpane;
    @FXML private Label greetingLabel;

    @FXML
    public void switchOrdersPane() throws IOException {
        try {
            super.switchPane("orders.fxml", borderpane);
        } catch (Exception exception) {
            greetingLabel.setText("İstediğiniz sayfa şu an getirilemiyor.\nDaha sonra tekrar deneyin.");
            borderpane.setLeft(greetingLabel);
        }

    }

    @FXML
    public void switchProductsPane(ActionEvent event) throws IOException {
        try {
            super.switchPane("products.fxml", borderpane);
        } catch (Exception exception) {
            greetingLabel.setText("İstediğiniz sayfa şu an getirilemiyor.\nDaha sonra tekrar deneyin.");
            borderpane.setLeft(greetingLabel);
        }
    }

    @FXML
    public void switchIncomingOrderPane(ActionEvent event) throws IOException {
        try {
            super.switchPane("incoming-order.fxml", borderpane);
        } catch (Exception exception) {
            greetingLabel.setText("İstediğiniz sayfa şu an getirilemiyor.\nDaha sonra tekrar deneyin.");
            borderpane.setLeft(greetingLabel);
        }
    }

    @FXML
    public void switchMoneySafePane(ActionEvent event) throws IOException {
        try {
            super.switchPane("money-safe.fxml", borderpane);
        } catch (Exception exception) {
            greetingLabel.setText("İstediğiniz sayfa şu an getirilemiyor.\nDaha sonra tekrar deneyin.");
            borderpane.setLeft(greetingLabel);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        greetingLabel.setText("Yapmak istediğiniz işlemleri\nsağdaki butonlara tıklayarak gerçekleştirebilirsiniz.");
        borderpane.setLeft(greetingLabel);
    }
}
