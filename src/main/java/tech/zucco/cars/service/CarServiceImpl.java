package tech.zucco.cars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.zucco.cars.model.Car;
import tech.zucco.cars.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car addNewCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }
}
