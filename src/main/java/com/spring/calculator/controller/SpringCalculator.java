package com.spring.calculator.controller;

import com.spring.calculator.sharedFunctions.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SpringCalculator {
    @Autowired
    Operations operation;

    @RequestMapping("/add")
    public Double add(@RequestHeader Map<String, String> map){
        double a = Double.parseDouble(map.get("operand1"));
        double b = Double.parseDouble(map.get("operand2"));
        return operation.add(a,b);
    }

    @RequestMapping("/subtract")
    public Double subtract(@RequestHeader Map<String, String> map){
        double a = Double.parseDouble(map.get("operand1"));
        double b = Double.parseDouble(map.get("operand2"));
        return operation.subtract(a,b);
    }

    @RequestMapping("/multiply")
    public Double multiply(@RequestHeader Map<String, String> map){
        double a = Double.parseDouble(map.get("operand1"));
        double b = Double.parseDouble(map.get("operand2"));
        return operation.multiply(a,b);
    }

    @RequestMapping("/divide")
    public Double divide(@RequestHeader Map<String, String> map){
        double a = Double.parseDouble(map.get("operand1"));
        double b = Double.parseDouble(map.get("operand2"));
        return operation.divide(a,b);
    }



}
