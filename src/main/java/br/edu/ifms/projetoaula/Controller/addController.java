package br.edu.ifms.projetoaula.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.projetoaula.Domain.add;


@RestController
@RequestMapping(value = "/add")
public class addController {
    
    @GetMapping("/{n1}/{n2}")
    public ResponseEntity<Integer> add(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
        add add_operation = new add(n1, n2);
        return ResponseEntity.ok(add_operation.getResult());
    }
}