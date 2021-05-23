package pl.kmiecik.thymeleaf_hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/helloName")
    public String sayHellowithName(Model model){
        model.addAttribute("name","Krzysztof");
        return "helloName";
    }

}
