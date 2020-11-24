package tech.zucco.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.zucco.cars.model.Car;
import tech.zucco.cars.service.CarService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public @ResponseBody
    Optional<Car> findById(@RequestParam Long id) {
        return carService.findById(id);
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    List<Car> getAllCars() {
        return carService.findAll();
    }


    @PostMapping(path = "/add")
    public @ResponseBody
    Car addNewCar(@RequestParam String model, @RequestParam String colour) {
        Car newCar = new Car();
        newCar.setModel(model);
        newCar.setColour(colour);
        return carService.addNewCar(newCar);
    }

}
