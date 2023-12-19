package tradearea.model;

import java.util.Date;

public class ProductData {

    private int productID;
    private String productName;
    private String productCategory;
    private double productPrice;
    private int productStock;
    private int productExpiryDate;
    private boolean productAvailability;

    public ProductData(int productID, String productName, String productCategory, double productPrice, int productStock, int productExpiryDate, boolean productAvailability) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productExpiryDate = productExpiryDate;
        this.productAvailability = productAvailability;
    }

    /**
     * Setter and Getter Methods
     */
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getProductExpiryDate() {
        return productExpiryDate;
    }

    public void setProductExpiryDate(int productExpiryDate) {
        this.productExpiryDate = productExpiryDate;
    }

    public boolean isProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

    @Override
    public String toString() {
        String info = String.format("Product Info: ID = %d, Name = %s, Category = %s, Price = %.2f", productID, productName, productCategory, productPrice);
        return info;
    }
}
