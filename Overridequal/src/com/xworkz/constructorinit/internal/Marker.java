package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Marker {

    private String color;
    private int quantity;
    private String brand;
    private double price;

    public Marker(String color, int quantity, String brand, double price) {
        this.color = color;
        this.quantity = quantity;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Marker{color=" + color + ",quantity=" + quantity + ",brand=" + brand + ",price=" + price + "}";
    }


    public boolean Make(Object obj) {
        if (obj!= null && obj instanceof Marker)
        {
            Marker marker = (Marker) obj;
            if (Objects.equals(this.color, marker.color) &&
                    Objects.equals(this.brand, marker.brand) &&
                    Objects.equals(this.quantity,marker.quantity)&&
                    Objects.equals(this.price,marker.price))
            {
                System.out.println("Marker is Matching");
                return true;
            }
        }
        System.out.println("Marker is not matching");
        return false;
    }
}