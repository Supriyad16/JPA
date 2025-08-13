package com.xworkz.solar.service;

import com.xworkz.solar.dto.SolarDTO;
import com.xworkz.solar.entity.SolarEntity;

import com.xworkz.solar.repository.SolarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SolarServiceImp implements SolarService{
    @Autowired
    SolarRepository solarRepository;

    @Override
    public boolean save(SolarDTO solarDTO) {

        System.out.println("Service"+solarDTO);
        SolarEntity solarEntity = new SolarEntity();

        solarEntity.setName(solarEntity.getName());
        solarEntity.setNumber(solarEntity.getNumber());
        solarEntity.setColour(solarEntity.getColour());
        solarEntity.setSatellite(solarEntity.getSatellite());

        return false;
    }
}
