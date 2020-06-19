package com.ficticiusclean.ficticiusclean.vehicle;

import com.ficticiusclean.ficticiusclean.app.exceptionhandler.ExceptionHandler;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleRequest;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleResponse;
import com.ficticiusclean.ficticiusclean.vehicle.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("vehicles")
public class VehicleController extends ExceptionHandler {

    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public void create(@Valid @RequestBody VehicleRequest vehicleRequest) {
        vehicleService.save(vehicleRequest);
    }

    @GetMapping("fuel_autonomy")
    public List<VehicleResponse> getFuelAutonomy(@RequestParam Float fuelPrice,
                                                 @RequestParam Float totalTraveledCity,
                                                 @RequestParam Float totalTraveledHighway) {
        return vehicleService.getVehicles(fuelPrice, totalTraveledCity, totalTraveledHighway);
    }
}
