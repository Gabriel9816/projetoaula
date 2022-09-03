package br.edu.ifms.projetoaula.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class add {
    private int number1;
    private int number2;

    public int getResult() {
        return number1 + number2;
    }
}