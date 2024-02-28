package com.massil.mapstruct.mapstructdemo.mapper;

import com.massil.mapstruct.mapstructdemo.dto.StudentDto;
import com.massil.mapstruct.mapstructdemo.model.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(target = "birthDate", source = "birthDate",dateFormat = "dd/MMM/yyyy")
    @Mapping(target = "studentId",source = "id")
    StudentDto toStudentDto(Student student);
    List<StudentDto> toStudentDtoList(List<Student> students);
    @InheritInverseConfiguration
    @Mapping(target = "birthDate", expression = "java(parseDate(studentDto.getBirthDate()))")
    Student toStudent(StudentDto studentDto);
    List<Student> toStudentList(List<StudentDto> students);


    default String customDate(Date date)  {
        if(null != date) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            String format = dateFormat.format(date);
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
            String format1 = timeFormat.format(date);
            return format + " " + format1;
        }
        return "";
    }

    default Date parseDate(String dateStr) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
        } catch (ParseException e) {
            // Handle parsing exception
            e.printStackTrace();
            return null;
        }
    }

}
