package com.massil.mapstruct.mapstructdemo.dto;

import com.massil.mapstruct.mapstructdemo.model.College;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class StudentDto extends Response{
    private UUID studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNumber;
    private String address;
    private String birthDate;
    private College college;
}
