package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate

    @ManyToOne(orphanRemoval=true)
    @JoinColumn(name="clientId")
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        this.creationDate = creationDate;
    }  

    public void setClient(){
        return this.client = client;
    }

    public Client getClient(){
        return client;
    }

}
