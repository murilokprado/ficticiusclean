package com.ficticiusclean.ficticiusclean.vehicle.service;

import com.ficticiusclean.ficticiusclean.vehicle.Vehicle;
import com.ficticiusclean.ficticiusclean.vehicle.VehicleRepository;
import com.ficticiusclean.ficticiusclean.vehicle.exception.VehicleAlreadyExistException;
import com.ficticiusclean.ficticiusclean.vehicle.factory.VehicleFactory;
import com.ficticiusclean.ficticiusclean.vehicle.payload.VehicleRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VehicleServiceImplTest {

    private static final Float CONSUME_BY_KM = 6F;
    private static final Float TOTAL_TRAVELED = 100F;
    private static final Float TOTAL_CONSUMED = 16.666666F;
    private static final Float FUEL_PRICE = 4.29F;
    private static final Float TOTAL_FUEL_PRICE = 212.2678F;
    private static final Float TOTAL_FUEL_SPENT = 49.479675F;
    private static final Float LITER_CITY = 15.3333333F;
    private static final Float LITER_HIGHWAY = 34.1463415F;

    @InjectMocks
    VehicleServiceImpl vehicleService;

    @Mock
    VehicleRequest vehicleRequest;

    @Mock
    VehicleRepository vehicleRepository;

    @Mock
    VehicleFactory vehicleFactory;

    @Test
    public void shouldCalculateConsumed() {
        Float totalConsumed = vehicleService.consumed(CONSUME_BY_KM, TOTAL_TRAVELED);

        assertThat(totalConsumed).isEqualTo(TOTAL_CONSUMED);
    }

    @Test
    public void shouldCalculateTotalFuelPrice() {
        Float totalValueSpent = vehicleService.calculateTotalFuelPrice(TOTAL_FUEL_SPENT, FUEL_PRICE);

        assertThat(totalValueSpent).isEqualTo(TOTAL_FUEL_PRICE);
    }

    @Test
    public void shouldCalculateTotalFuelSpent() {
        Float totalFuelSpent = vehicleService.totalFuelSpent(LITER_CITY, LITER_HIGHWAY);

        assertThat(totalFuelSpent).isEqualTo(TOTAL_FUEL_SPENT);
    }

    @Test
    public void shouldCreateVehicle() {
        Vehicle vehicle = vehicleService.save(vehicleRequest);

        verify(vehicleRepository).save(vehicle);
    }

    @Test(expected = VehicleAlreadyExistException.class)
    public void shouldThrowVehicleAlreadyExistException() {
        when(vehicleRepository.existsVehicleByName(vehicleRequest.getName())).thenReturn(true);

        vehicleService.save(vehicleRequest);
    }
}
