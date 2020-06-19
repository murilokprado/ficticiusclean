package com.ficticiusclean.ficticiusclean.vehicle.service;

import com.ficticiusclean.ficticiusclean.vehicle.Vehicle;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleRequest;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleResponse;

import java.util.List;

public interface VehicleService {

    List<VehicleResponse> getVehicles(Float fuelPrice, Float totalTraveledCity, Float totalTraveledHighway);

    Vehicle save(VehicleRequest vehicleRequest);
}
