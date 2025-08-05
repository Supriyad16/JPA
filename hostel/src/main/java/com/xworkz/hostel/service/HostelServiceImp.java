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

    @Override
    public HostelEntity getHostelEntityById(int id) {
        HostelRepository hostelRepository = new HostelRepositoryImp();
        return hostelRepository.getHostelEntityById(id);
    }

    @Override
    public boolean updateHostelEntityById(int id, String candidateName) {
        HostelRepository hostelRepository = new HostelRepositoryImp();
        return hostelRepository.updateHostelEntityById(id,candidateName);
    }

    @Override
    public void deleteHostelEntityById(int id) {
        HostelRepository hostelRepository = new HostelRepositoryImp();
        hostelRepository.deleteHostelEntityById(id);

    }
}
