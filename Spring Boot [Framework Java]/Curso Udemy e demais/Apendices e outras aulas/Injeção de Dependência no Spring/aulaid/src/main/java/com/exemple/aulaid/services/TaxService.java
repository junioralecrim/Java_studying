package com.exemple.aulaid.services;
import org.springframework.stereotype.Service;

@Service
public class TaxService{
    public double tax(double value){
        return value * 0.10;
    }
}
