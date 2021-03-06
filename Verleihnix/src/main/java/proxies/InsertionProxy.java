package proxies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import javax.validation.constraints.NotNull;


/**
 * represents the in-/ output data object for the insertion
 */
@JsonRootName("Insertion")
public class InsertionProxy {

    @JsonProperty
    private long id;

    @JsonProperty
    @NotNull
    private long poolId;

    @JsonProperty
    @NotNull
    private ProductImgProxy product;

    @JsonProperty
    @NotNull
    private String title;

    @JsonProperty
    @NotNull
    private String description;

    @JsonProperty
    private double pricePerDay;

    @JsonProperty
    private boolean active;

    public InsertionProxy() {
        super();
        this.id = -1;
        this.poolId = -1;
        this.product = new ProductImgProxy();
        this.title = null;
        this.description = null;
        this.active = true;
        this.pricePerDay = 0.0;
    }

    public InsertionProxy(long id, long poolId, long productId, String insertionTitle, String insertionDescription, String productTitle, String productDescription, boolean active, double pricePerDay) {
        super();
        this.id = id;
        this.poolId = poolId;
        this.product = new ProductImgProxy(productId,productTitle, productDescription);
        this.title = insertionTitle;
        this.description = insertionDescription;
        this.active = active;
        this.pricePerDay = pricePerDay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPoolId() {
        return poolId;
    }

    public void setPoolId(long poolId) {
        this.poolId = poolId;
    }

    public ProductImgProxy getProduct() {
        return product;
    }

    public void setProduct(ProductImgProxy product) {
        this.product = product;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}