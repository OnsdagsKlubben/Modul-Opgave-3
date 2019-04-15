package org.dat18c.shipsandsails.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{
    @GetMapping(value="/")
    public String getHome(@RequestParam String param) 
    {
        return "Home";
    }
}