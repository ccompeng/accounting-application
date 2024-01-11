package Template;

public class Product extends AccApp {
    private String productID;
    private float price;
    private float cost;
    private int stock;
    private float taxAmount;
    private float earning;
    private String imageFile;

    public Product() {}
    public Product(String productID, float price, float cost, int stock, String imageFile) {
        this.productID = productID;
        this.price = price;
        this.cost = cost;
        this.stock = stock;
        this.taxAmount = this.getTaxAmount();
        this.earning = this.getEarning();
        this.imageFile = imageFile;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID() { this.productID = super.generateID(); }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String formatPrice() { return String.format("%.2f", this.getPrice()); }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String formatCost() { return String.format("%.2f", this.getCost()); }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock -= stock;
    }

    public float getTaxAmount() {
        this.taxAmount = (this.price - this.cost) * 0.25f;
        return this.taxAmount;
    }

    public String formatTaxAmount() { return String.format("%.2f", this.getTaxAmount()); }

    public float getEarning() {
        this.earning = (this.price - this.cost) - this.getTaxAmount();
        return this.earning;
    }

    public String formatEarning() { return String.format("%.2f", this.getEarning()); }

    public String getImageFile() { return imageFile; }

    public void setImageFile(String imageFile) { this.imageFile = imageFile; }
}
