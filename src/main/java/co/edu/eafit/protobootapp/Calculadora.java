package co.edu.eafit.protobootapp;

import org.springframework.stereotype.Service;

@Service
public class Calculadora {

    public Double cuadrado(Double numero) {
        return numero * numero;
    }
    
    public Double cubo(Double numero) {
        return numero * numero * numero;
    }

    public Double exponential(Double number, int exponential) {
        return Math.pow(number, exponential);
    }
}
