package pl.kmiecik.thymeleaf_hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    List<Car> carsList;


    public CarController() {
        Car car1 = new Car(0L, "BMW", "i7");
        Car car2 = new Car(1L, "Fiat", "ducato");
        Car car3 = new Car(2L, "Polonez", "Caro");
        Car car4 = new Car(3L, "Skoda", "Octavia");
        carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
    }

    @GetMapping("/car")
    public String getCar(Model model) {
        model.addAttribute("myCars", carsList);
        model.addAttribute("newCar", new Car()); // do wykorzystania w post
        return "myCar";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car) {
        carsList.add(car);
        return "redirect:/car";
    }


    @PostMapping("/remove-car")
    public String removeCar(@ModelAttribute Car car) {
        carsList.remove(car.getId().intValue());
        return "redirect:/car";
    }

    @PostMapping("/update-car")
    public String updateCar(@ModelAttribute Car car) {
        carsList.remove(car.getId().intValue());
        carsList.add(car);
        return "redirect:/car";
    }


}
