package com.example.MakeMyTrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Cabs {
    @GetMapping("/mycabs")
    public String getData(){
        return"Please check available cab services";
    }
}
