package com.xworkz.solar.component;

import com.xworkz.solar.dto.SolarDTO;
import com.xworkz.solar.service.SolarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SolarComponent {

    @Autowired
    SolarService solarService;

    public SolarComponent(){
        System.out.println("No-arg SolarComponent");

    }

    @RequestMapping("/solar")

    public String planetDetails(SolarDTO solarDTO)
    {
        System.out.println("Running Solar Component");
        System.out.println(solarDTO);
        solarService.save(solarDTO);

        return "solarResult";
    }

}
