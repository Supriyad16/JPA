package com.xworkz.solar.component;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SolarComponent {

    public SolarComponent(){
        System.out.println("No-arg SolarComponent");

    }




}
