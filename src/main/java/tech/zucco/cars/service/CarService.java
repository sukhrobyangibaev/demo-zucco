package tech.zucco.cars.service;

import tech.zucco.cars.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> findAll();

    Car addNewCar(Car car);

    Optional<Car> findById(Long id);
}
