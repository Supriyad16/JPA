package com.xworkz.hostel.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hostel_details")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class HostelEntity {

    @Id
    private int id;

    @Column(name = "hname")
    private String hostelName;

    @Column(name = "cname")
    private String candidateName;

    private int roomno;
}
