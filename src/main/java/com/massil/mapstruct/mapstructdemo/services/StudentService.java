package com.massil.mapstruct.mapstructdemo.services;

import com.massil.mapstruct.mapstructdemo.dto.StudentDto;
import com.massil.mapstruct.mapstructdemo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    void addStudent(StudentDto student);
    int removeStudent(UUID studentId);
    List<StudentDto> getStudentList();
}
