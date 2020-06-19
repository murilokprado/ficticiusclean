package com.ficticiusclean.ficticiusclean.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    boolean existsVehicleByName(String name);
}
