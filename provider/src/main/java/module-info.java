import org.example.provider.SwedishConverter;
import org.example.provider.EuroConverter;

import org.example.service.CurrencyConverter;


module org.example.provider {

    requires org.example.service;


    provides CurrencyConverter with EuroConverter,SwedishConverter;




}