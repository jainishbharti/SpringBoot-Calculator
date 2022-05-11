package com.spring.calculator.sharedFunctions;

import org.springframework.stereotype.Component;

@Component
public class Operations {

    public Double add(Double a, Double b){
        return a+b;
    }

    public Double subtract(Double a, Double b){
        return a-b;
    }

    public Double multiply(Double a, Double b){
        return a*b;
    }

    public double divide(Double a, Double b){
        return (double) a/b;
    }


}
