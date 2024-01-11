package org.example.accountingapplication;

import Template.Customer;
import Template.Order;
import Template.Data;
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

public class OrderController implements Initializable {
    @FXML private TableView<Order> orderTableView;
    @FXML private TableColumn<Order, String> orderID;
    @FXML private TableColumn<Order, String> customerID;
    @FXML private TableColumn<Order, Float> totalAmount;
    @FXML private TableColumn<Order, String> orderDate;

    private final ObservableList<Order> orderList = FXCollections.observableArrayList();

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
        orderID.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        customerID.setCellValueFactory(new PropertyValueFactory<>("customerID"));
        totalAmount.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        orderDate.setCellValueFactory(new PropertyValueFactory<>("orderDate"));

        if (!Data.getOrders().isEmpty()) {
            orderList.addAll(Data.getOrders());
        }

        orderList.addAll(order1, order2, order3, order4);

        FilteredList<Order> filteredList = new FilteredList<>(orderList, b->true);
        SortedList<Order> sortedList = new SortedList<>(filteredList);
        sortedList.comparatorProperty().bind(orderTableView.comparatorProperty());
        orderTableView.setItems(sortedList);
    }
}
