package com.apispring.apimarket.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="compras")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idBuy;

    @Column(name="id_cliente")
    private String idClient;

    @Column(name="fecha")
    private LocalDateTime date;

    @Column(name="medio_pago")
    private String paymentMethod;

    @Column(name="comentario")
    private String comments;

    @Column(name="estado")
    private String status;

    public Integer getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(Integer idBuy) {
        this.idBuy = idBuy;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
