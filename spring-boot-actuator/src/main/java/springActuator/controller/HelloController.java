package springActuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/names")
    public List<String> getNames(){
        return Arrays.asList("Ahmad", "Karim", "Jamshid");
    }

}