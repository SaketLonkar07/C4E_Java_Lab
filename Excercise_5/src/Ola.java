package com.vehicles;

public class Ola extends Vehicle {
    private String type;

    public Ola(){}

    public Ola(String VehicleId,String brand,int Rent,String type){
        super(VehicleId , brand, Rent);
        this.type=type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public float TotalRent(int days) {
        float price = this.getRent() * days;

    }

}
