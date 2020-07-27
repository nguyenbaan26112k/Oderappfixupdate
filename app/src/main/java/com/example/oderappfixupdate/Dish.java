package com.example.oderappfixupdate;

import java.io.Serializable;

public class Dish implements Serializable {
    String img,name;
    int amount;
    double price;

    public Dish(String img, String name, int amount, double price) {
        this.img = img;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
