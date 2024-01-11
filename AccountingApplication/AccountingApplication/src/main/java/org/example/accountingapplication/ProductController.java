package org.example.accountingapplication;

import Template.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductController implements Initializable {
    @FXML private TableView<Product> productTableView;
    @FXML private TableColumn<Product, String> productID;
    @FXML private TableColumn<Product, Integer> stock;
    @FXML private TableColumn<Product, Float> price;
    @FXML private TableColumn<Product, Float> cost;
    @FXML private TableColumn<Product, Float> taxAmount;
    @FXML private TableColumn<Product, Float> earning;

    private final ObservableList<Product> productList = FXCollections.observableArrayList();

    Product product1 = new Product("def990", 12450.50f, 9500.0f, 18, "assets/cam1.jpg");
    Product product2 = new Product("caff21", 15750.50f, 10500.0f, 14, "assets/cam2.jpg");
    Product product3 = new Product("a34ab6", 9000.75f, 6000.0f, 8, "assets/computer1.jpg");
    Product product4 = new Product("d88ef9", 13750.50f, 9500.0f, 18, "assets/headphone1.jpg");
    Product product5 = new Product("cdef77", 10500.0f, 7500.0f, 10, "assets/headphone2.jpg");
    Product product6 = new Product("67ab89", 13550.50f, 10500.0f, 8, "assets/phone1.jpg");
    Product product7 = new Product("adde43", 15000.0f, 12000.0f, 14, "assets/phone2.jpg");
    Product product8 = new Product("55af62", 12500.0f, 9500.0f, 13, "assets/watch1.jpg");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        productID.setCellValueFactory(new PropertyValueFactory<>("productID"));
        stock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        taxAmount.setCellValueFactory(new PropertyValueFactory<>("taxAmount"));
        earning.setCellValueFactory(new PropertyValueFactory<>("earning"));

        productList.addAll(product1, product2, product3, product4, product5, product6, product7, product8);

        FilteredList<Product> filteredList = new FilteredList<>(productList, b->true);
        SortedList<Product> sortedList = new SortedList<>(filteredList);
        sortedList.comparatorProperty().bind(productTableView.comparatorProperty());
        productTableView.setItems(sortedList);
    }
}
