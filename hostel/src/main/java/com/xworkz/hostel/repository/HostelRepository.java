package com.xworkz.hostel.repository;

import com.xworkz.hostel.entity.HostelEntity;

public interface HostelRepository {

    HostelEntity save(HostelEntity hostelEntity);

    HostelEntity getHostelEntityById(int id);

    boolean updateHostelEntityById(int id, String candidateName);

    void deleteHostelEntityById(int id);


}
