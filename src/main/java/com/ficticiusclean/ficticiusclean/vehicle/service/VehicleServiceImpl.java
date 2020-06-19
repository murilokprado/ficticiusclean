package com.ficticiusclean.ficticiusclean.vehicle.service;

import com.ficticiusclean.ficticiusclean.vehicle.Vehicle;
import com.ficticiusclean.ficticiusclean.vehicle.VehicleRepository;
import com.ficticiusclean.ficticiusclean.vehicle.exception.VehicleAlreadyExistException;
import com.ficticiusclean.ficticiusclean.vehicle.factory.VehicleFactory;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleRequest;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleResponse;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;

    private VehicleFactory vehicleFactory;

    public VehicleServiceImpl(VehicleRepository vehicleRepository, VehicleFactory vehicleFactory) {
        this.vehicleRepository = vehicleRepository;
        this.vehicleFactory = vehicleFactory;
    }

    public VehicleResponse calcConsumption(Vehicle vehicle,
                                           Float fuelPrice,
                                           Float totalTraveledCity,
                                           Float totalTraveledHighway) {
        Float litersCity = consumed(vehicle.getConsumptionCity(), totalTraveledCity);
        Float litersHighway = consumed(vehicle.getConsumptionHighway(), totalTraveledHighway);

        Float totalFuelSpent = totalFuelSpent(litersCity, litersHighway);
        Float totalFuelPrice = calculateTotalFuelPrice(totalFuelSpent, fuelPrice);

        return vehicleFactory.create(vehicle, totalFuelSpent, totalFuelPrice);
    }

    public Float calculateTotalFuelPrice(Float totalFuelSpent, Float fuelPrice) {
        return totalFuelSpent * fuelPrice;
    }

    public Float totalFuelSpent(Float litersCity, Float litersHighway) {
        return litersCity + litersHighway;
    }

    public Float consumed(Float consumedByKm, Float totalTraveled) {
        return totalTraveled / consumedByKm;
    }

    @Override
    public List<VehicleResponse> getVehicles(Float fuelPrice, Float totalTraveledCity, Float totalTraveledHighway) {
        List<Vehicle> vehicles = getVehicles();

        return vehicles.stream()
                .map(v -> calcConsumption(v, fuelPrice, totalTraveledCity, totalTraveledHighway))
                .sorted(Comparator.comparing(VehicleResponse::getTotalValueSpent))
                .collect(Collectors.toList());
    }

    @Override
    public Vehicle save(VehicleRequest vehicleRequest) {
        if (vehicleRepository.existsVehicleByName(vehicleRequest.getName())) {
            throw new VehicleAlreadyExistException(vehicleRequest.getName());
        }

        Vehicle vehicle = vehicleFactory.create(vehicleRequest);

        return vehicleRepository.save(vehicle);
    }

    private List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }
}
