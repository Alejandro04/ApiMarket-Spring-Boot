package com.apispring.apimarket.persistence.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ProductPurchase {
    @EmbeddedId
    private ProductPurchasePK id;

    @Column(name = "cantidad")
    private Integer quantity;
    private Double total;

    @Column(name = "estado")
    private Boolean status;

    public ProductPurchasePK getId() {
        return id;
    }

    public void setId(ProductPurchasePK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}