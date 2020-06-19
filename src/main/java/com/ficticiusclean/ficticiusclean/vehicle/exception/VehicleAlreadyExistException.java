package com.ficticiusclean.ficticiusclean.vehicle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class VehicleAlreadyExistException extends RuntimeException {

    public VehicleAlreadyExistException(String name) {
        super(String.format("Veículo com o nome '%s' já está cadastrado", name));
    }
}
