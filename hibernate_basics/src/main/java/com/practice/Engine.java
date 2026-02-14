package com.practice;












import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
    @Id
    private int id;
    private String type;
    private String fuelType;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getMileage() {
        return mileage;
    }

    public String getCc() {
        return Cc;
    }

    private String mileage;

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public void setCc(String cc) {
        Cc = cc;
    }

    String Cc;
}




