package org.example.provider;

import org.example.service.CurrencyConverter;

public class EuroConverter implements CurrencyConverter {


    @Override
    public String convert(double amount) {
        return "EURO to SEK: " + amount * 0.088;
    }
}
