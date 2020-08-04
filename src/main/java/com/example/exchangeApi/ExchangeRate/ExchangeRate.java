package com.example.exchangeApi.ExchangeRate;


public class ExchangeRate {
    private String fr;
    private String to;

    public ExchangeRate(String fr, String to) {
        this.fr = fr;
        this.to = to;
    }

    public String getFrom() {
        return fr;
    }

    public String getTo() {
        return to;
    }
}