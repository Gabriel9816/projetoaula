package br.edu.ifms.projetoaula.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.projetoaula.Domain.add;


@RestController
@RequestMapping(value = "/add")
public class addController {
    
    @GetMapping("/{n1}/{n2}")
    public Integer add(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
        return new add(n1, n2).getResult();
    }


    @PostMapping
    public Integer addByPost(@RequestBody add Add) {
        return Add.getResult();
    }
}