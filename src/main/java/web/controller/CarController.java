package web.controller;


import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {


    @Autowired
    private CarService carService;


    @GetMapping
    public String getAllCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars;

        if (count == null || count >= 5) {
            cars = carService.getAllCars();
        } else {
            cars = carService.getCars(count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}

