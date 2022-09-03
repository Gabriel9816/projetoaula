package br.edu.ifms.projetoaula.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.projetoaula.Domain.greeting;

@RestController
@RequestMapping(value = "/greeting")
public class greetingController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        greeting greeting = new greeting("Hello, World!");
        return ResponseEntity.ok(greeting.getGreeting());
    }
}