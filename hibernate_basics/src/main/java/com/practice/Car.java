package com.practice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
    @Id
    int id;
    String Brand;
    String Model;
    String ModelYear;
    int Price;

    @OneToOne(cascade = CascadeType.ALL)
    private Engine engine;

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setModelYear(String modelYear) {
        ModelYear = modelYear;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }
}