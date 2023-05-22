package com.example.demo;

import com.example.demo.service.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
@AllArgsConstructor
public class MainController {

    private CountryRepository countryRepository;
    @PostMapping(path="/add")
    public @ResponseBody String addNewCountry(@RequestBody Country country){
        countryRepository.save(country);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Country> getAllCountries(){
        return countryRepository.findAll();
    }
}
