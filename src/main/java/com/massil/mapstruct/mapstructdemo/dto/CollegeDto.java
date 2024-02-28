package com.massil.mapstruct.mapstructdemo.dto;

import com.massil.mapstruct.mapstructdemo.model.Student;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CollegeDto extends Response{
    private UUID collegeId;
    private String name;
    private String address;
    private List<Student> studentList;

}
