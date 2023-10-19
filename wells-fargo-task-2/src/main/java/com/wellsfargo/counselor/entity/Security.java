package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long price;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private long quantity;

    @OneToOne(orphanRemoval=true)
    @JoinColumn(name="portfolioId")
    private Portfolio portfolio;

    protected Security() {

    }

    public Advisor(String name, String category, long price, long date, long quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.date = date;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getquantity() {
        return quantity;
    }

    public void setquantity(long quantity) {
        this.quantity = quantity;
    }

    public void setPortfolio(){
        return this.portfolio = portfolio;
    }

    public Portfolio getPortfolio(){
        return portfolio;
    }
}
