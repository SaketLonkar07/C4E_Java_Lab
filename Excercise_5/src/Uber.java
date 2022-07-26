package com.vehicles;

public class Uber extends Vehicle {
    private String type;

    public Uber() {
    }

    public Uber(String vehicleId, String brand, int Rent, String type) {
        super(vehicleId, brand, Rent);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}