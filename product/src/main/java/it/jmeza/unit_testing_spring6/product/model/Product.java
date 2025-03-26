package it.jmeza.unit_testing_spring6.product.model;

public class Product {
    private Integer id;
    private String name;
    private Integer quantity;
    private Integer version;

    public Product() {
    }

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Product(Integer id, String name, Integer quantity, Integer version) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.version = version;
    }

    public Product(Integer id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product {id=" + id + ", name=" + name + ", quantity=" + quantity + ", version=" + version + "}";
    }
}
