package pl.kmiecik.thymeleaf_hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    List<Car> carsList;

    public CarController() {
        Car car1 = new Car("BMW", "i7");
        Car car2 = new Car("Fiat", "ducato");
        Car car3 = new Car("Polonez", "Caro");
        Car car4 = new Car("Skoda", "Octavia");
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
}
