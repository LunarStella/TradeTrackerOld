package com.example.tradetracker.dto;

import java.time.LocalDate;

public class StockTransactionDto {

    private String stockType; // 주식 종류
    private double price; // 주식 가격
    private int quantity; // 주식 개수
    private LocalDate date; // 날짜


    public StockTransactionDto(String stockType, double price, int quantity, LocalDate date) {
        this.stockType = stockType;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }

    // Getter 및 Setter 메서드
    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
