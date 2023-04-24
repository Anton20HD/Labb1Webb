package org.example.consumer;

import org.example.service.CurrencyConverter;

import java.security.Provider;
import java.util.Scanner;
import java.util.ServiceLoader;

public class CurrencyConverterApp {


    public static void main(String[] args) {


        ServiceLoader<CurrencyConverter> currencyConverters = ServiceLoader.load(CurrencyConverter.class);

       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the amount:");

        double amount = scanner.nextDouble();

                for ( var currency : currencyConverters) {
            System.out.println(currency.convert(amount));
                }




    }


}
