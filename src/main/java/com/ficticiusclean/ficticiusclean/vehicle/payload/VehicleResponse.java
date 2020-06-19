package com.ficticiusclean.ficticiusclean.vehicle.payload;

import java.time.LocalDate;

public class VehicleResponse {

    private String name;
    private String model;
    private LocalDate manufacturingDate;
    private Float consumptionCity;
    private Float consumptionHighway;
    private Float totalFuelSpent;
    private Float totalValueSpent;

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

    public Float getTotalFuelSpent() {
        return totalFuelSpent;
    }

    public void setTotalFuelSpent(Float totalFuelSpent) {
        this.totalFuelSpent = totalFuelSpent;
    }

    public Float getTotalValueSpent() {
        return totalValueSpent;
    }

    public void setTotalValueSpent(Float totalValueSpent) {
        this.totalValueSpent = totalValueSpent;
    }
}
