package org.example.provider;

import org.example.service.CurrencyConverter;

public class SwedishConverter implements CurrencyConverter {


    @Override
    public String convert(double amount) {
        return "SEK to EURO: " + amount * 11.32;
    }
}
