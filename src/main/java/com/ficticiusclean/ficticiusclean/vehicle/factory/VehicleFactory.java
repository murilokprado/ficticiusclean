package com.ficticiusclean.ficticiusclean.vehicle.factory;

import com.ficticiusclean.ficticiusclean.vehicle.Vehicle;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleRequest;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleResponse;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {

    public Vehicle create(VehicleRequest vehicleRequest) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(vehicleRequest.getName());
        vehicle.setModel(vehicleRequest.getModel());
        vehicle.setManufacturingDate(vehicleRequest.getManufacturingDate());
        vehicle.setConsumptionCity(vehicleRequest.getConsumptionCity());
        vehicle.setConsumptionHighway(vehicleRequest.getConsumptionHighway());

        return vehicle;
    }

    public VehicleResponse create(Vehicle vehicle, Float totalFuelSpent, Float totalFuelPrice) {
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setName(vehicle.getName());
        vehicleResponse.setModel(vehicle.getModel());
        vehicleResponse.setManufacturingDate(vehicle.getManufacturingDate());
        vehicleResponse.setConsumptionCity(vehicle.getConsumptionCity());
        vehicleResponse.setConsumptionHighway(vehicle.getConsumptionHighway());
        vehicleResponse.setTotalFuelSpent(totalFuelSpent);
        vehicleResponse.setTotalValueSpent(totalFuelPrice);

        return vehicleResponse;
    }
}
