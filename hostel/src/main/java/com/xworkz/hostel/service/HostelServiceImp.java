package com.xworkz.hostel.service;

import com.xworkz.hostel.entity.HostelEntity;
import com.xworkz.hostel.repository.HostelRepository;
import com.xworkz.hostel.repository.HostelRepositoryImp;

public class HostelServiceImp implements HostelService{
    @Override
    public HostelEntity save(HostelEntity hostelEntity) {

        System.out.println("Service Implements"+hostelEntity);

        HostelRepository hostelRepository = new HostelRepositoryImp();
        hostelRepository.save(hostelEntity);
        return null;
    }
}
