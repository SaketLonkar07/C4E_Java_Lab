package com.vehicles;
public class Vehicle {

    private String vehicleId;

    private String brand;

    private int Rent;

    public Vehicle(){}

    public Vehicle(String vehicleId, String brand, int Rent{
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.Rent=Rent;
    }

    public String getVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public int getRent(){
        return Rent;
    }
    public void setRent(int Rent){
        this.getRent()=Rent;
    }
    public abstract float TotalRent(int days);//abstract method
}
