package com.ficticiusclean.ficticiusclean.vehicle.payload;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

public class VehicleRequest {

    @NotNull(message = "nome do veículo deve ser informado")
    private String name;

    @NotNull(message = "modelo do veículo deve ser informado")
    private String model;

    @NotNull(message = "data de fabricação do veículo deve ser informada")
    @PastOrPresent(message = "data de fabricação do veículo deve ser menor que hoje")
    private LocalDate manufacturingDate;

    @NotNull(message = "consumo médio de combustível (dentro da cidade) do veículo deve ser informado")
    @Min(value = 1, message = "consumo médio deve ser maior que zero")
    private Float consumptionCity;

    @NotNull(message = "consumo médio de combustível (em rodovias) do veículo deve ser informado")
    @Min(value = 1, message = "consumo médio deve ser maior que zero")
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
