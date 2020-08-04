package com.example.exchangeApi.Conversion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conversion {

    @Id
    @GeneratedValue
    private int id;
    private double result, amount;
    private String fr, to;

    public Conversion(String fr, String to, double amount) {
        this.amount = amount;
        this.fr = fr;
        this.to=to;
        this.result = result;
    }
    public Conversion(){
    // Default constructor
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public double getResult() {
        return result;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
