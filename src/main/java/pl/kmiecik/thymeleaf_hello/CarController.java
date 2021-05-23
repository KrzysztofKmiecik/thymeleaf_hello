package pl.kmiecik.thymeleaf_hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

@GetMapping("/cars")
    public String getCar(Model model){
    Car car1=new Car("BMW","i7");
    Car car2=new Car("Fiat","ducato");
    Car car3=new Car("Polonez","Caro");
    Car car4=new Car("Skoda","Octavia");
    List<Car> carsList = Arrays.asList(car1,car2,car3,car4);

     model.addAttribute("myCars",carsList);
    return "myCar";
}

}
