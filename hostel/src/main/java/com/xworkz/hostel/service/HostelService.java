package com.xworkz.hostel.service;

import com.xworkz.hostel.entity.HostelEntity;

public interface HostelService {

    HostelEntity save(HostelEntity hostelEntity);


    HostelEntity getHostelEntityById(int id);

    boolean updateHostelEntityById(int id, String candidateName);

    void deleteHostelEntityById(int id);


}
