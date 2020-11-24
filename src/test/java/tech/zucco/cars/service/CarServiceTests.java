package tech.zucco.cars.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zucco.cars.model.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CarServiceTests {
    @Autowired
    private CarService carService;

    @Test
    void testCarService() {
        List<Car> carList = new ArrayList<>();

        Car car1 = new Car();
        car1.setId(1l);
        car1.setModel("Ferrari");
        car1.setColour("Red");

        Car car2 = new Car();
        car2.setId(2l);
        car2.setModel("Tesla");
        car2.setColour("Grey");

        Car car3 = new Car();
        car3.setId(3l);
        car3.setModel("Volvo");
        car3.setColour("Black");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        for (int i = 0; i < carList.size(); i++) {
            assertEquals(carList.get(i).getId(), carService.findAll().get(i).getId());
            assertEquals(carList.get(i).getModel(), carService.findAll().get(i).getModel());
            assertEquals(carList.get(i).getColour(), carService.findAll().get(i).getColour());
        }

        for (int i = 1; i <= carList.size(); i++) {
            assertEquals(true, carService.findById((long) i).isPresent());
        }

        Car newCar = new Car();
        newCar.setId(4l);
        newCar.setModel("Audi");
        newCar.setColour("BLue");

        assertEquals(newCar.getId(), carService.addNewCar(newCar).getId());
        assertEquals(newCar.getModel(), carService.addNewCar(newCar).getModel());
        assertEquals(newCar.getColour(), carService.addNewCar(newCar).getColour());

    }
}
