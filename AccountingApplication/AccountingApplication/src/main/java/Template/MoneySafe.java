package Template;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MoneySafe {
    private ArrayList<Order> orders = new ArrayList<Order>();
    private double totalMoney = 0.0;
    private double totalCost = 0.0;
    private double totalTax = 0.0;
    private double payment = 0.0;
    private double leftMoney = 0.0;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public MoneySafe() {}

    public MoneySafe(long totalMoney, long totalTax, long payment, long leftMoney) {
        this.totalMoney = totalMoney;
        this.totalTax = totalTax;
        this.payment = payment;
        this.leftMoney = leftMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney() {
        for (Order order: Data.getOrders()) {
            totalMoney += order.getTotalAmount();
        }
    }

    public void setTotalMoney(Order order) {
        totalMoney += order.getTotalAmount();
    }

    public String formatTotalMoney() { return String.format("%.2f", this.getTotalMoney()); }

    public double getTotalCost() { return totalCost; }

    public void setTotalCost() {
        for (Order o: this.orders) {
            for (Product p: o.getProducts()) {
                this.totalCost += p.getCost();
            }
        }
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax() {
        this.totalTax = (this.totalMoney - this.totalCost) * 0.25;
    }

    public String formatTotalTax() { return String.format("%.2f", this.getTotalTax()); }

    public double getPayment() { return payment; }

    public void setPayment() {
        this.payment = 28500.0;
    }

    public String formatPayment() { return String.format("%.2f", this.getPayment()); }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney() {
        this.leftMoney = this.totalMoney - (this.totalTax + this.payment);
    }

    public String formatLeftMoney() { return String.format("%.2f", this.getLeftMoney()); }
}
