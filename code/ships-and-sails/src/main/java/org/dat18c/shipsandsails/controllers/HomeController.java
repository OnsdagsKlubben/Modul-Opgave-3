package org.dat18c.shipsandsails.controllers;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> 77d4a7b527202ae4753469db128cfe17845ba564

@Controller
public class HomeController 
{
<<<<<<< HEAD
    @RequestMapping
    public String getHome()
=======
    @GetMapping(value="/")
    public String getHome(@RequestParam String param) 
>>>>>>> 77d4a7b527202ae4753469db128cfe17845ba564
    {
        return "Home";
    }
}