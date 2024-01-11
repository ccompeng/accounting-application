package org.example.accountingapplication;

import Test.CustomerTest;
import Test.MoneySafeTest;
import Test.OrderTest;
import Test.ProductTest;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 600);
        stage.setTitle("Accounting Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        OrderTest.testOrderClass();
        System.out.println("\n\n");
        ProductTest.testProductClass();
        System.out.println("\n\n");
        MoneySafeTest.testMoneySafeClass();
        System.out.println("\n\n");
        CustomerTest.testCustomerClass();

        launch();
    }
}