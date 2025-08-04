package com.xworkz.hostel.runner;

import com.xworkz.hostel.entity.HostelEntity;
import com.xworkz.hostel.service.HostelService;
import com.xworkz.hostel.service.HostelServiceImp;

public class HostelRunner {

    public static void main(String[] args) {

        HostelEntity hostelEntity = new HostelEntity(1, "Sai Ganesh", "Anu", 4);

        HostelService hostelService = new HostelServiceImp();
        hostelService.save(hostelEntity);

    }
}
