package com.massil.mapstruct.mapstructdemo.controller;

import com.massil.mapstruct.mapstructdemo.dto.CollegeDto;
import com.massil.mapstruct.mapstructdemo.dto.Response;
import com.massil.mapstruct.mapstructdemo.dto.StudentDto;
import com.massil.mapstruct.mapstructdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentContoller {

    @Autowired
    private StudentService service;

    @GetMapping("getallStudents")
    public List<StudentDto> getAll(){
        return service.getStudentList();
    }

    @PostMapping("addstudent")
    public Response addStudent(@RequestBody StudentDto studentDto){
        service.addStudent(studentDto);
        return new Response(HttpStatus.OK.value(), "Saved",true);

    }
}
