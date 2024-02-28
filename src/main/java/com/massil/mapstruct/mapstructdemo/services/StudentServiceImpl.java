package com.massil.mapstruct.mapstructdemo.services;

import com.massil.mapstruct.mapstructdemo.dto.StudentDto;
import com.massil.mapstruct.mapstructdemo.mapper.StudentMapper;
import com.massil.mapstruct.mapstructdemo.model.Student;
import com.massil.mapstruct.mapstructdemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void addStudent(StudentDto student) {
        Student student1 = studentMapper.toStudent(student);
        studentRepo.save(student1);
    }

    @Override
    public int removeStudent(UUID studentId) {
        Optional<Student> student = studentRepo.findById(studentId);
        if (student.isPresent()) {
            studentRepo.delete(student.get());
            return 1;
        }

        return 0;
    }

    @Override
    public List<StudentDto> getStudentList() {

        List<Student> all = studentRepo.findAll();
        List<StudentDto> studentDtoList = studentMapper.toStudentDtoList(all);
        return studentDtoList;
    }
}
