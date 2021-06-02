package com.company;

public class Car {
    final String model;
    final String producer;
    public String price;
    private Double value;
    public Car(String model, String producer, String price, Double value) {
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.value = value;
    }

    public  Double getValue(){
        return  this.value;
    }
}
