package br.edu.ifms.projetoaula.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.projetoaula.Domain.greeting;

@RestController
@RequestMapping(value = "/greeting")
public class greetingController {
    
    @GetMapping
    public greeting sayHello() {
        return new greeting("Hello, World!");
    }
  
    @GetMapping("/{name}")
    public greeting pathParam(@PathVariable("name") String name) {
        return new greeting("Hello, " + name);
    }


    @GetMapping("/")
    public greeting queryParam(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new greeting("Hello, " + name);
    }


    @PostMapping
    public greeting postMethod(@RequestBody greeting greeting) {
        return greeting;
    }
}
