package web.service;
import model.Car;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        this.cars = Arrays.asList(
                new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Civic", 2019),
                new Car("Tesla", "Model 3", 2021),
                new Car("Ford", "Mustang", 2022),
                new Car("Chevrolet", "Corvette", 2022)
        );
    }

    public List<Car> getAllCars() {
        System.out.println(cars);
        return cars;
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
