package com.ficticiusclean.ficticiusclean.vehicle;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicle")
    @SequenceGenerator(name = "vehicle", sequenceName = "s_vehicle", allocationSize = 1)
    private Integer id;

    private String name;
    private String model;
    private LocalDate manufacturingDate;
    private Float consumptionCity;
    private Float consumptionHighway;

    public Float getConsumptionCity() {
        return consumptionCity;
    }

    public void setConsumptionCity(Float consumptionCity) {
        this.consumptionCity = consumptionCity;
    }

    public Float getConsumptionHighway() {
        return consumptionHighway;
    }

    public void setConsumptionHighway(Float consumptionHighway) {
        this.consumptionHighway = consumptionHighway;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
