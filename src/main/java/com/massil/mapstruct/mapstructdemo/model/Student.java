package com.massil.mapstruct.mapstructdemo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNumber;
    private String address;
    private Date birthDate;
    @ManyToOne(targetEntity = College.class)
    @JoinColumn(name = "college_id")
    private College college;
}
