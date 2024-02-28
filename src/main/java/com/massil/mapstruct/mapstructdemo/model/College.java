package com.massil.mapstruct.mapstructdemo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class College {
    @Id
    @Column(name = "college_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "college")
    private List<Student> studentList;

}
