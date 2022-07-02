package com.exercicio02.app.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prod;
    private String name;
    private int quantity;
    @ManyToOne()
    @JoinColumn(name="prod_cat_id")
    @JsonIgnore()
    private Category category;

    public Product() {}

    public Product(Long id_prod, String name, int quantity) {
        this.id_prod = id_prod;
        this.name = name;
        this.quantity = quantity;
    }

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

}
