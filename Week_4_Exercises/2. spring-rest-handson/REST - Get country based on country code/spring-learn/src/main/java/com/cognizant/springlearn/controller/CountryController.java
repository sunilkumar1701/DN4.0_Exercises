package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        System.out.println("START getCountry() with code = " + code);
        Country country = countryService.getCountry(code);
        System.out.println("END getCountry()");
        return country;
    }
}
