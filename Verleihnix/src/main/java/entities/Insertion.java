package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * represents the entity model for an Insertion
 */
@Entity(name="Insertion")
public class Insertion {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JsonIgnore
    private Pool pool;

    @Column
    private String title;

    @Column
    private double pricePerDay;

    @Column(columnDefinition = "text")
    private String description;

    @Lob
    @Column
    private String image;

    @Column
    private boolean active;

    @ManyToOne
    @JsonIgnore
    private Product product;

    @OneToMany(mappedBy = "insertion", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval=true)
    private List<InsertionRequest> insertionRequests = new ArrayList<InsertionRequest>();

    public Insertion() {
        super();
    }

    public Insertion(Pool pool,String title, String description, boolean active, Product product, double pricePerDay) {
        super();
        this.pool = pool;
        this.title = title;
        this.description = description;
        this.active = active;
        this.product = product;
        this.pricePerDay = pricePerDay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<InsertionRequest> getInsertionRequests() {
        return insertionRequests;
    }

    public void setInsertionRequests(List<InsertionRequest> insertionRequests) {
        this.insertionRequests = insertionRequests;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
