package Models;

/**
 *
 * @author Duy
 */
public class Product {
    private String productId;
    private String productName;
    private String description;
    private String brandId;

    public Product(String productId, String productName, String description, String brandId) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.brandId = brandId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

}
