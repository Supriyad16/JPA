package com.xworkz.solar.repository;

import com.xworkz.solar.entity.SolarEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SolarRepositoryImp implements SolarRepository{
    @Override
    public boolean save(SolarEntity solarEntity) {
        System.out.println("Repository"+solarEntity);
        return false;
    }
}
